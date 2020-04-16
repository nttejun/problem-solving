package baekjoon;

// 1 - N
// next permutation

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10972 {

    private static boolean next(int[] v) {

        // check
        int i = v.length - 1;

        while (i > 0 && v[i - 1] >= v[i]) {

            i -= 1;

        }

        if (i <= 0) {

            return false;

        }

        // solve
        int j = v.length - 1;

        while (v[j] <= v[j - 1]) {

            j -= 1;

        }

        int temp = v[i - 1];
        v[i - 1] = v[j];
        v[j] = temp;

        // bigger digit change
        while (i < j) {
            temp = v[i];
            v[i] = v[j];
            v[j] = temp;
            i += 1;
            j -= 1;
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int digit = scanner.nextInt();

        int[] value = new int[digit];

        for (int i = 0; i < digit; i++) {

            value[i] = scanner.nextInt();

        }

        if (next(value) == true) {

            for (int i = 0; i < value.length; i++) {

                System.out.print(value[i] + " ");

            }

        } else {

            System.out.println("-1");

        }


    }
}
