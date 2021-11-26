package programmers;

public class ProgLv1SumOfTwoInteger {

  public long solution(int a, int b) {
    long answer = 0;

    if (a == b) {
      answer = a;
      return answer;
    } else if (a > b) {
      for (int i = b; i <= a; i++) {
        answer = answer + i;
      }
      return answer;
    } else if (a < b) {
      for (int i = a; i <= b; i++) {
        answer = answer + i;
      }
      return answer;
    } else {
      return answer;
    }
  }

  public long solution1(int a, int b) {
    return sumSolution1(Math.min(a, b), Math.max(b, a));
  }

  // 등차수열의 합
  private long sumSolution1(long a, long b) {
    return (b - a + 1) * (a + b) / 2;
  }

  public long solution2(int a, int b) {

    long answer = 0;

    for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
      answer += i;
    }

    return answer;

  }

  public long solution3(int a, int b) {

    long answer = 0;

    int max = Math.max(a, b);
    int min = Math.min(a, b);

    for (int i = min; i <= max; i++) {
      answer += i;
    }

    return answer;

  }

  public static void main(String[] args) {
    ProgLv1SumOfTwoInteger p = new ProgLv1SumOfTwoInteger();
    System.out.println(p.solution(300000, 299998));
    System.out.println(p.solution1(300000, 299998));
    System.out.println(p.solution2(300000, 299998));
    System.out.println(p.solution3(300000, 299998));
  }
}
