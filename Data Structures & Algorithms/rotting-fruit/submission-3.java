class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] v = new boolean[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i, j});
                    v[i][j] = true;
                }
            }
        }
        int time = 0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0; i < len; i++){
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];
                grid[r][c] = -1;
                addFruit(grid, v, r + 1, c, q);
                addFruit(grid, v, r, c + 1, q);
                addFruit(grid, v, r - 1, c, q);
                addFruit(grid, v, r, c - 1, q);
            }
            //System.out.println("len " + len + ":" + "time " + time);  
            if(!q.isEmpty())
                time++;
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return time;
    }

    public void addFruit(int[][] grid, boolean[][] v, int r, int c, Queue<int[]> q){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || v[r][c] == true || grid[r][c] == 0){
            return;
        }

        q.add(new int[]{r, c});
        v[r][c] = true;
    }
}
