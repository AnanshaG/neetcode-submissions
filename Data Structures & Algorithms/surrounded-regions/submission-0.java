class Solution {
    public void solve(char[][] board) {
    int rows = board.length;
    int cols = board[0].length;

    HashSet<List<Integer>> set = new HashSet<>();

    for(int i = 0; i < cols; i++){
        dfs(board, set, 0, i);
        dfs(board, set, rows - 1, i);
    }

    for(int i = 0; i < rows; i++){
        dfs(board, set, i, 0);
        dfs(board, set, i, cols - 1);
    }

    for(int r = 0; r < rows; r++){
        for(int c = 0; c < cols; c++){
            if(!set.contains(List.of(r,c))){
                board[r][c] = 'X';
            }
        }
    }


    }

    public void dfs(char[][] board, HashSet<List<Integer>> set, int r, int c){
        if( r < 0 || c < 0 || r >= board.length || c >= board[0].length || 
        board[r][c] == 'X' || set.contains(List.of(r,c))){
            return;
        }

        set.add(List.of(r,c));
        dfs(board, set, r + 1, c);
        dfs(board, set, r, c + 1);
        dfs(board, set, r - 1, c);
        dfs(board, set, r, c - 1);
    }
}
