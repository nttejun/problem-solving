package resolve;

import java.util.Scanner;

/**
 * Created by nttej on 2017-10-29.
 */

// add nextInt() increase the line
public class Backjoon11022 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int caseNum = scanner.nextInt();

        int[] res = new int[caseNum];
        int[] a = new int[caseNum];
        int[] b = new int[caseNum];

        for (int i = 0; i < caseNum; i++) {

            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();

        }

        for (int j = 0; j < caseNum; j++) {

            res[j] = a[j] + b[j];

            System.out.println("Case #"+(j+1)+": "+a[j]+" + "+b[j]+" = "+res[j]);

        }

    }

}
