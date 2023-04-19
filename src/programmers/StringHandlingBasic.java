package programmers;

/***
 * 문제 설명
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 *
 * 제한 사항
 * s는 길이 1 이상, 길이 8 이하인 문자열입니다.
 * s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
 */
public class StringHandlingBasic {

  /***
   * 정규표현식 방법
   * ^ : 시작, $ : 끝, [0-9] : 0부터 9, [a-Z] : a 부터 Z까지, + : 해당 문자가 반복사용 가능
   */
  public boolean solution(String s) {
    if((s.length() == 4 || s.length() == 6) && s.matches("^[0-9]+$")) {
      return true;
    }
    return false;
  }

  /***
   * 타입변환으로 숫자가 아닐시 Exception 발생시키는 방법
   */
  public boolean solutionExceptionVersion(String s) {
    try {
      Integer.parseInt(s);
      if((s.length() == 4 || s.length() == 6) && s.matches("^[0-9]+$")) {
        return true;
      }
    } catch (Exception e) {
      return false;
    }
    return false;
  }
}
