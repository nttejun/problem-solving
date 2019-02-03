package resolve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2635 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        if (num1 >= 30000) return;
        if (num1 < 1) return;
        builder.append(num1 + " ");

        int num2 = scan.nextInt();
        if (num2 < 1) return;
        builder.append(num2 + " ");

        int count = 2;

        int num3;
        boolean flag = false;
        while (flag == false) {

            num3 = num1 - num2;
            num1 = num2;
            num2 = num3;

            if (num3 < 0) {

                flag = true;

            } else {

                builder.append(num3 + " ");
                count++;

            }
        }

        System.out.println(count);
        System.out.println(builder.toString());

    }
}
