package programmers;

import java.util.Scanner;

public class Lv1StringPrint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(a + b);
  }

  public void getAB() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}
