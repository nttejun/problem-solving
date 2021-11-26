package baekjoon;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import org.junit.Test;

/**
 * Created by nttej on 2017-11-14.
 */



/*
    '(' , ')' >> 괄호모양이 올바르다 = 괄호문자열
    "()" 기호로 된 문자열 = VPS
    "(x)" = vps >> "(xy)" = vps
    주어진 괄호 문자열이 VPS 인가 YES or NO 출력
 */


public class Baekjoon9012 {

  public List<String> psv(String[] value) {

    char right = '(';
    char left = ')';

    List<String> res = new ArrayList<>();

    for (int i = 0; i < value.length; i++) {

      Stack rStack = new Stack();
      Stack lStack = new Stack();

      for (int j = 0; j < value[i].substring(0).length(); j++) {

        if (value[i].charAt(j) == right) {

          if (lStack.isEmpty() == false) {

            lStack.pop();

          } else {

            rStack.push(right);

          }

        } else if (value[i].charAt(j) == left) {

          if (rStack.isEmpty() == false) {

            rStack.pop();

          } else {

            lStack.push(left);

          }

        }

      }

      if ((rStack.isEmpty() && lStack.isEmpty()) == false) {

        System.out.println("NO");
        res.add("NO");

      } else {

        System.out.println("YES");
        res.add("YES");

      }

    }

    return res;

  }

  public static void main(String[] args) {

    Baekjoon9012 b9012 = new Baekjoon9012();

    Scanner scanner = new Scanner(System.in);

    int time = scanner.nextInt();

    String[] test = new String[time];

    for (int i = 0; i < time; i++) {

      test[i] = scanner.next();

      if (test[i].length() < 2 || test[i].length() > 50) {

        i = i - 1;

      }

    }

    b9012.psv(test);

  }

  @Test
  public void check1() {

    String[] test = {"(())())", "(((()())()", "(()())((()))", "((()()(()))(((())))()",
        "()()()()(()()())()", "(()((())()("};
    List<String> res = new ArrayList<>();
    res.add("NO");
    res.add("NO");
    res.add("YES");
    res.add("NO");
    res.add("YES");
    res.add("NO");

    assertEquals(res, psv(test));

  }
}
