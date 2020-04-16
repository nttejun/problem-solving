package baekjoon;

import java.util.Scanner;

public class Baekjoon2443 {
    public static void main(String[] args) {
        Baekjoon2443 baekjoon2443 = new Baekjoon2443();
        baekjoon2443.markStar();
    }

    private void markStar() {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int s = N * 2 - 1 ;
        for (int i = 1; i <= N; i++) {
            for (int j = N - i + 1; j < N; j++) {
                stringBuilder.append(" ");
            }
            for (int j = 1; j <= s; j++) {
                stringBuilder.append("*");
            }
            s = s-2 ;
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
