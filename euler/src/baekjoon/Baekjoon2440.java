package baekjoon;

import java.util.Scanner;

public class Baekjoon2440 {
    public static void main(String[] args) {
        Baekjoon2440 baekjoon2440 = new Baekjoon2440();
        baekjoon2440.markStar();
    }

    private void markStar() {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=1; i<=N; i++){
            for (int j=i; j<=N; j++){
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
