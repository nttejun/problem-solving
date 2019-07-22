package resolve;

import java.util.Scanner;

/**
 * Created by nttej on 2017-10-30.
 */


public class Backjoon1476 {

    public void ready(int[] year){

        int res = play(year[0], year[1], year[2], 0);
        System.out.println(res);
    }

    private int play(int e, int s, int m, int start){

        if(e==1 && s==1 && m==1){
            return start+1;
        }

        if( 1 > e || 15 < e ){
            e=15;
        }
        if( 1 > m || 28 < m ){
            m=28;
        }
        if( 1 > s || 19 < s) {
            s=19;
        }

        e--;
        m--;
        s--;
        start++;

        return play(e, s, m, start);

    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] year = new int[3];

        for(int i=0; i<3; i++){

            year[i] =scanner.nextInt();

        }

        Backjoon1476 b1476 = new Backjoon1476();

        b1476.ready(year);

    }

}


/*
3개의 수(지구, 태양, 달)를 이용해 연도계산

지구 E 태양 S 달 M (1 <= E <= 15 / 1 <= S <= 28 / 1 <= M <= 19)

우리가 알고있는 1년은 111로 나타낼 수 있다

1년 지날때 마다 세 수 모두 1씩 증가

범위 넘어갈 시 1로 된다

1 16 16

우리가 알고있는 연도로 몇 년인지 구하는 프로그램

입력 = 첫째 줄에 세 수 E, S, M 주어진다
문제 나와있는 범위를 지키는 입력만 주어진다

출력 = E S M으로 표시되는 가장 빠른 연도를 출력.
1 1 1은 항상 1이므로 정답이 음수인 경우가 많다

1 16 16 >> 1
1 1 1 >> 1
1 2 3 >> 5266
15 28 19 >> 7980

*//*


*/
