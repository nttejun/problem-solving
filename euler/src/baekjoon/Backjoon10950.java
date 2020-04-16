package baekjoon;

import java.util.Scanner;

/**
 * Created by nttej on 2017-10-29.
 */

// next() is Space-based word
// nextLine() is One line of text or sentence
public class Backjoon10950 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int time = scan.nextInt();

        int[] res = new int[time];

        for (int i = 0; i < time; i++) {

            int data = 0;

            for (int j = 0; j < 2; j++) {

                data = data + Integer.parseInt(scan.next());

            }

            res[i] = data;
        }

        for (int k = 0; k < res.length; k++) {

            System.out.println(res[k]);

        }
    }
}
