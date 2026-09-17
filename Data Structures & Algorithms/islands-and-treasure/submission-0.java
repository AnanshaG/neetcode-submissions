class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visit = new boolean[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 0){
                    q.add(new int[]{i, j});
                    visit[i][j] = true;
                }
            }
        }
        int loc = 0;
        while(!q.isEmpty()){
            
            int len = q.size();
            for(int i = 0; i < len;  i++){
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];
                grid[r][c] = loc;
                addNext(r + 1, c, grid, visit, q);
                addNext(r - 1, c, grid, visit, q);
                addNext(r, c + 1, grid, visit, q);
                addNext(r, c - 1, grid, visit, q);
            }
            loc++;
        }
    }

    public void addNext(int r, int c, int[][]grid, boolean[][] visit, Queue<int[]> q){

        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || visit[r][c] == true || grid[r][c] == -1)
        return;

        q.add(new int[]{r, c});
        visit[r][c] = true;

    }
}
