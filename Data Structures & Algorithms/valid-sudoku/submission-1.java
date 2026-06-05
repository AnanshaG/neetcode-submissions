class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++){
                char pos = board[i][j];
                if(pos == '.'){
                    continue;
                }
                if(!(seen.add(pos + "at row" + i) &&
                    seen.add(pos + "at col" + j) &&
                        seen.add(pos + "in box" + i/3 + " - " + j/3)))
                    {
                        return false;
                    }
            }
        }
        return true;
    }
}
