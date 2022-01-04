package letcode.easy;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class ArrayTypeValidSudoku {

  public boolean isValidSudoku(char[][] board) {

    for (int i = 0; i < 9; i++) {
      Set<Character> rows = new HashSet<>();
      Set<Character> cols = new HashSet<>();
      Set<Character> subs = new HashSet<>();
      for (int j = 0; j < 9; j++) {
        if (board[i][j] != '.' && !rows.add(board[i][j])) {
          return false;
        }

        if (board[j][i] != '.' && !cols.add(board[j][i])) {
          return false;
        }

        int rowIndex = 3 * (i / 3);
        int colIndex = 3 * (i % 3);

        int iIndex = rowIndex + j / 3;
        int jIndex = colIndex + j % 3;
        if (board[iIndex][jIndex] != '.' &&
            !subs.add(board[rowIndex + j / 3][colIndex + j % 3])) {
          return false;
        }
      }
    }
    return true;
  }

  @Test
  public void isValidSudoku_테스트_CASE1() {
    char[][] board = {{'8', '3', '.', '.', '7', '.', '.', '.', '.'}
        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
    System.out.println(isValidSudoku(board));
  }

  @Test
  public void isValidSudoku_테스트_CASE2() {
    char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
    System.out.println(isValidSudoku(board));
  }
}
