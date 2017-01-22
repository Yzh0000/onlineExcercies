public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> rowCheck = new HashSet<>();
        Set<String> colCheck = new HashSet<>();
        Set<String> cellCheck = new HashSet<>();
        
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    if (!rowCheck.add("" + ch + "in row " + i)) return false;
                    if (!colCheck.add("" + ch + "in column " + j)) return false;
                    if (!cellCheck.add("" + ch + "in cell " + (i/3 * 10 + j/3))) return false;
                }
            }
        }
        
        return true;
        
    }
}