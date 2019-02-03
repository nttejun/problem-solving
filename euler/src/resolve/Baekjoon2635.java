package resolve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2635 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int num = scan.nextInt();
        if (num >= 30000) return;
        if (num < 1) return;
        list.add(num);

        num = scan.nextInt();
        if (num < 1) return;
        list.add(num);

        int count = 2;
        int index = 1;

        boolean flag = false;

        while (flag == false) {

            int tmp = list.get(index - 1) - list.get(index);

            if (tmp < 0) {

                flag = true;

            } else {

                list.add(tmp);
                index++;
                count++;

            }
        }

        builder.append(count + "\n");

        for (Integer n : list) {
            builder.append(" " + n);
        }

        System.out.println(builder.toString());

    }
}

