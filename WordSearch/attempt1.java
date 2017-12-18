package Leetcode.WordSearch;

public class attempt1 {
    public static void main(String[] args) {
        char[][] chars = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(exist(chars, "ABCCED"));
    }

    public static boolean exist(char[][] board, String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == s.charAt(0)) {
                    if (helper(board, s, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    private static boolean helper(char[][] board, String s, int i, int j, int index) {
        if (index == s.length()) {
            return true;
        }
        if (i < 0 || i >= board.length) {
            return false;
        }
        if (j < 0 || j >= board[0].length) {
            return false;
        }
        if (board[i][j] == '-') {
            return false;
        }

        if (board[i][j] == s.charAt(index)) {
            char temp = board[i][j];
            board[i][j] = '-';
            if (helper(board, s, i, j + 1, index + 1) ||
                    helper(board, s, i + 1, j, index + 1) ||
                    helper(board, s, i - 1, j, index + 1) ||
                    helper(board, s, i, j - 1, index + 1)){
                    return true;
            }
            board[i][j] = temp;
        }
        return false;
    }
}
