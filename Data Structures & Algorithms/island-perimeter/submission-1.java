class Solution {
    
    public int islandPerimeter(int[][] grid) {

        int peri = 0;

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++ ){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                peri = dfs(grid, i, j, visited, peri);
                }
            }
        }

        return peri;
        
    }

    public int dfs(int[][] grid, int r, int c, boolean[][] visited, int peri){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0){
            return peri += 1;
        }
        if(visited[r][c] == true){
            return peri += 0;
        }

        visited[r][c] = true;
        peri = dfs(grid, r + 1, c,  visited, peri) + 
        dfs(grid, r - 1, c,  visited, peri) +
        dfs(grid, r,  c + 1,  visited, peri) +
        dfs(grid, r, c - 1,  visited, peri);

        return peri;

    }
}