package resolve;

import java.util.Scanner;

/**
 * Created by nttej on 2017-10-20.
 */

public class Backjoon1463 {

    static int[] d;

    public static int start(int n){

        if (n == 1) {
            return 0;
        }

        d[n] = start(n - 1) + 1;

        if (n % 2 == 0) {
            int temp = d[n / 2];
            if (temp < d[n]) {
                d[n] = temp + 1;
            }
        }

        if (n % 3 == 0) {
            int temp = d[n / 3];
            if (temp < d[n]) {
                d[n] = temp + 1;
            }
        }
        return d[n];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 0 || n > 1000000) {
            n = scanner.nextInt();
        }

        d = new int[n+1];

        Backjoon1463 backjoon1436 = new Backjoon1463();
        System.out.println(backjoon1436.start(n));
    }
}
