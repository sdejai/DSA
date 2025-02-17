package Codes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class NQueen {
    public static List < List < String >> nQueen(int n) {
        char[][] chessBoard = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                chessBoard[i][j] = '.';
        List < List < String >> res = new ArrayList < List < String >> ();
        answerSet(0, chessBoard, res);
        return res;
    }

    public static boolean attackOrNot(char[][] board, int row, int col) {
        int copyrow = row;
        int copycol = col;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        row = copyrow;
        col = copycol;
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }

        row = copyrow;
        col = copycol;
        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q') return false;
            col--;
            row++;
        }
        return true;
    }

    public static void answerSet(int col, char[][] board, List < List < String >> res) {
        if (col == board.length) {
            res.add(creatingAnswer(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (attackOrNot(board, row, col)) {
                board[row][col] = 'Q';
                answerSet(col + 1, board, res);
                board[row][col] = '.';
            }
        }
    }

    public static List < String > creatingAnswer(char[][] board) {
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    public static void main(String args[]) {
        int n = 4;
        List < List < String >> queen = nQueen(n);
        for (List < String > it: queen) {
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
        }  
    }
}
