package resolve;

import java.util.Scanner;

public class Baekjoon2438 {

    public static void main(String[] args) {

        Baekjoon2438 baekjoon2438 = new Baekjoon2438();
        baekjoon2438.makeStar();

    }

    public void makeStar() {
        Scanner scan = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int N = scan.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }
}
