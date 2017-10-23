package resolve;

import static java.lang.Character.toLowerCase;

import java.util.*;

/**
 * Created by nttej on 2017-10-24.
 */

public class CountAlphabetMax {

    public int solution(String strAlpha) {

        int dataSize = strAlpha.length();
        int[] aToZ = new int[26];

        for (int a = 0; a < dataSize; a++) {

            if (((int) strAlpha.charAt(a) < 97 || (int) strAlpha.charAt(a) > 122) && ((int) strAlpha.charAt(a) < 65 || (int) strAlpha.charAt(a) > 90)) {

                return 0;

            }

        }

        for (int i = 0; i < dataSize; i++) {

            if ((int) strAlpha.charAt(i) > 64 || (int) strAlpha.charAt(i) < 91) {

                aToZ[(int) toLowerCase(strAlpha.charAt(i)) - 'a']++;

            } else {

                aToZ[(int) strAlpha.charAt(i) - 'a']++;

            }

        }

        int answer = 0;

        for (int j = 0; j < 26; j++) {

            if (answer < aToZ[j]) {

                answer = aToZ[j];

            }

        }

        return answer;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CountAlphabetMax countAlphabet = new CountAlphabetMax();
        System.out.println(countAlphabet.solution(scanner.next()));

    }

}


