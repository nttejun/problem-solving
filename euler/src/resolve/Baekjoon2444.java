package resolve;

import java.util.Scanner;

public class Baekjoon2444 {
    public static void main(String[] main) {
        Baekjoon2444 baekjoon2444 = new Baekjoon2444();
        baekjoon2444.markStar();
    }

    private void markStar() {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int s = 1;

        markPlus(sb, N, s);
        markMinus(sb, N, s);

        System.out.println(sb.toString());
    }

    private StringBuilder markPlus(StringBuilder sb, int n, int s) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                sb.append(" ");
            }
            for (int j = i; j <= s; j++) {
                sb.append("*");
            }
            s = s + 3;
            sb.append("\n");
        }
        return sb;
    }

    private StringBuilder markMinus(StringBuilder sb, int n, int s) {
        for (int i = 1; i < n; i++) {
            for (int j = n-i; j < n; j++) {
                sb.append(" ");
            }
            for (int j = n-i; j < (n-i)*3-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb;
    }
}
