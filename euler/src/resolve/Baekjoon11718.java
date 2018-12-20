package resolve;

/*
    최대 100줄 입력, 한 줄에 100글자를 넘지 않는다.
    공백, 대소문자, 숫자만 입력 받는다.
    첫 번째와 마지막 문자는 공백 문자를 받지 않는다.
    입력받은 그대로 출력하라.
 */

/*
    1. 엔터 입력 처리 기준 (0)
    2. 문자 유효성 검사
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Baekjoon11718 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String result = "";

        String tempResult = "";

        int count = 0;

        while(scan.hasNext()){

            String temp = scan.nextLine();

            tempResult = result + temp;

            // 한 줄 최대 글자수 검수
            if (chkMax100(result.length())) break;

            // 글 전체 최대 문장수 검수
            if (chkMax100(count)) break;

            // 올바른 문자 사용 검수
            String resultRegex = "(^[a-zA-Z0-9]*$)";
            if(Pattern.matches(resultRegex, result) == false){
                break;
            }

            result = tempResult;

        System.out.println(temp);

        }

        System.out.println(result);

    }

    private static boolean chkMax100(int length) {
        if (length > 100) {
            return true;
        }
        return false;
    }

}
