class Solution {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        boolean[][] visited = new boolean[r][c];

        int islands = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(grid, i, j, visited);
                    islands += 1;
                }
            }
        }

        return islands;
        


    }

    public void dfs(char[][] grid, int r, int c, boolean[][] visited){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length 
        || visited[r][c] == true || grid[r][c] == '0'){
            return;
        }
        visited[r][c] = true;
        dfs(grid, r + 1, c, visited);
        dfs(grid, r - 1, c, visited);
        dfs(grid, r, c + 1, visited);
        dfs(grid, r, c - 1, visited);
    }
}
