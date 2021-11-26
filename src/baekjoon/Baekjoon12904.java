package baekjoon;

import java.util.Scanner;

public class Baekjoon12904 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.nextLine();
    String T = scan.nextLine();
    int result = 0;

    // S와 T 길이가 같아질 때 까지
    while (S.length() != T.length()) {
      if (T.charAt(T.length() - 1) == 'A') { // A면 삭제
        T = T.substring(0, T.length() - 1);
        // B면 B를 삭제하고 뒤집기
      } else {
        T = T.substring(0, T.length() - 1);
        T = new StringBuilder(T).reverse().toString();
      }
    }

    // eqauls 비교 필요한 것으로 보임
    result = T.equals(S) ? 1 : 0;
    System.out.println(result);
  }
}


/*

    while(T.length() != S.length()){
    if(T.back() == 'A'){
        T.pop_back();
    } else if (T.back() == 'B') {
        T.pop_back();
        reverse(T.begin(), T.end());
    }
    }

    cout << T == S ? 1 : 0 ) << end;

 */