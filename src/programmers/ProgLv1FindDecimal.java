package programmers;

public class ProgLv1FindDecimal {

  public int solution(int n) {
    int answer = 0;
    boolean flag = true;

    for (int i = 2; i <= n; i++) {
      flag = true;

      // N 값이 소수가 되기 위한 조건 >> 2보다 크거나, N/2 보다 작거나 같거나, 루트 N보다 작거나 같은 자수로 나누어지면 안된다.
      for (int j = 2; j * j <= i; j++) {
        if (i % j == 0) {
          flag = false;
          break;
        }
      }

      if (flag == true) {
        answer++;
      }

    }

    return answer;
  }

  public static void main(String[] args) {
    ProgLv1FindDecimal findDecimal = new ProgLv1FindDecimal();
    System.out.println(findDecimal.solution(10));
  }
}
