class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int area = 0;

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++ ){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    int area_int = dfs(grid, i, j, visited);
                    area = Math.max(area_int, area);
                }
            }
        }
        return area;
    }

    public int dfs(int[][] grid, int r, int c, boolean[][]visited){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length ||         grid[r][c] == 0 || visited[r][c] == true){
            return 0;
        }

        visited[r][c] = true;

        return 1 + dfs(grid, r + 1, c, visited) + 
                    dfs(grid, r - 1, c, visited) +
                    dfs(grid, r, c + 1, visited) +
                    dfs(grid, r, c - 1, visited) ;
    }
}
