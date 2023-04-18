package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/181186
// 가로 n, 세로 3
// 타일링 방법의 수

// 1 * 3 = 1개
// 2 * 3 = 3개
// 3 * 3 = 10개

public class Lv3AvantgardeTiling {
  public int solution(int n) {
    int answer = 0;

    int sharedValue;
    int rest;

    int mod = 1000000007;

    answer = getBasic(answer, n);
    if (answer != 0) {
      return answer;
    }

    if (n % 3 == 0) {
      sharedValue = n / 3;
      answer = sharedValue * 10;
      rest = n % 3;
      answer += getBasic(answer, rest);
    }
    return answer % mod;
  }

  public int getBasic(int answer, int n) {
    if (n == 1) {
      return 1;
    }

    if (n == 2) {
      return 3;
    }

    if (n == 3) {
      return 10;
    }
    return answer;
  }
}
