package baekjoon;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/***
 * 99개 값 저장할 수 있는 배열 item[0], item[1]... item[98]
 * 1부터 100까지 값이 들어있는 집합 [1, 2, 3 .... 100] 에서 무작위 수 꺼내어 배열에 저장한다.
 * 집합 원소의 수는 100개이고 배열은 값을 99개까지만 저장한다.
 * 집합 안의 남아있는 하나의 수를 구하여라
 */

public class BaekjoonLastNum {

    public static void main(String[] args) {

        int[] number = {
                1, 2, 3, 4, 5,
                6, 7, 8, 9, 10, 11,
                12, 13, 14, 15, 16, 17,
                18, 19, 20, 21, 22, 23,
                24, 25, 26, 27, 28, 29,
                30, 31, 32, 33, 34, 35,
                36, 37, 38, 39, 40, 41,
                42, 43, 44, 45, 46, 47,
                48, 49, 50, 51, 52, 53,
                54, 55, 56, 57, 58, 59,
                60, 61, 62, 63, 64, 65,
                66, 67, 68, 69, 70, 71,
                72, 73, 74, 75, 76, 77,
                78, 79, 80, 81, 82, 83,
                84, 85, 86, 87, 88, 89,
                90, 91, 92, 93, 94, 95,
                96, 97, 98, 99, 100
        };

        int target = 0;

        for (int i = 0; i < 99; i++) {

            int r = (int) (Math.random() * 100) + 1;
            target = number[r - 1];

            if (target != 0) {
                number[r - 1] = 0;
                System.out.println(target);
            } else {
                i--;
            }
        }

        for (int i = 0; i < 99; i++) {
            if (number[i] != 0) {
                System.out.println("End : " + number[i]);
                return;
            }
        }
    }

    @Test
    public void TEST_DELETE_NUMBER(){
        int[] number = {1, 2, 3, 4, 5};
        number[2] = 0;
        int deleteNumber = number[2];
        assertEquals(deleteNumber, 0);
    }

    @Test
    public void TEST_CENTER_LAST_NUMBER(){
        int[] number = {
                1, 2, 3, 4, 5,
                6, 7, 8, 9, 10, 11,
                12, 13, 14, 15, 16, 17,
                18, 19, 20, 21, 22, 23,
                24, 25, 26, 27, 28, 29,
                30, 31, 32, 33, 34, 35,
                36, 37, 38, 39, 40, 41,
                42, 43, 44, 45, 46, 47,
                48, 49, 50, 51, 52, 53,
                54, 55, 56, 57, 58, 59,
                60, 61, 62, 63, 64, 65,
                66, 67, 68, 69, 70, 71,
                72, 73, 74, 75, 76, 77,
                78, 79, 80, 81, 82, 83,
                84, 85, 86, 87, 88, 89,
                90, 91, 92, 93, 94, 95,
                96, 97, 98, 99, 100
        };

        for(int i=0; i<50; i++){
            number[i] = 0;
        }

        for(int i=51; i<100; i++){
            number[i] = 0;
        }

        for(int i=0; i<99; i++){
            if(number[i] != 0){
                assertEquals(number[i], 51);
                return;
            }
        }
    }
}
