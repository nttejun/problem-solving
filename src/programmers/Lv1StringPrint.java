package programmers;

import java.util.Scanner;
import org.junit.Test;

public class Lv1StringPrint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(a + b);
  }

  public void A_와_B_출력하기() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }

  public void 문자열_반복해서_출력하기(){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();

    for(int i=0; i<n; i++) {
      System.out.print(str);
    }
  }

  @Test
  public void 대소문자_바꿔서_출력하기() {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    int big = 65;
    int small = 97;

    for(int i=0; i<a.length(); i++) {
      int target = a.charAt(i);
      if (target >= 65 && target <97) {
        int gap = target - big;
        gap += small;
        System.out.print((char) gap);
      } else {
        int gap = target - small;
        gap += big;
        System.out.print((char) gap);
      }
    }
  }

  @Test
  public void 대소문자_바꿔서_출력하기_다른방법() {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    String answer = "";
    for (char c : a.toCharArray()) {
      if (c >= 65 && c <97) {
        answer += Character.toLowerCase(c);
      } else {
        answer += Character.toUpperCase(c);
      }
    }

    System.out.println(answer);
  }
}