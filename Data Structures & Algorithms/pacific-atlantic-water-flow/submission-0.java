class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int rows = heights.length;
        int cols = heights[0].length;

        HashSet<List<Integer>> pacific = new HashSet<>();
        HashSet<List<Integer>> atlantic = new HashSet<>();
        
        for(int c = 0; c < cols; c++){
            dfs(heights, heights[0][c], 0, c, pacific);
            dfs(heights, heights[rows-1][c], rows - 1, c, atlantic);
        }
        for(int r = 0; r < rows; r++){
            dfs(heights, heights[r][0], r, 0, pacific);
            dfs(heights, heights[r][cols-1], r, cols - 1, atlantic);
        }

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                List<Integer> lst = List.of(i,j);
                if(pacific.contains(lst) && atlantic.contains(lst)){
                    res.add(lst);
                }
            }
        }

        return res;


        
    }

    public void dfs(int[][] heights, int prev, int r, int c, HashSet<List<Integer>> set){

        if(r < 0 || c < 0 || r >= heights.length || c >= heights[0].length || set.contains(List.of(r,c)) || heights[r][c] < prev){
            return;
        }

        set.add(List.of(r,c));
        dfs(heights, heights[r][c], r + 1, c, set);
        dfs(heights, heights[r][c], r, c + 1, set);
        dfs(heights, heights[r][c], r - 1, c, set);
        dfs(heights, heights[r][c], r, c - 1, set);


    }
}
