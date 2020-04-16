package baekjoon;

import java.util.Scanner;

public class Baekjoon2442 {
    public static void main(String[] args){
        Baekjoon2442 baekjoon2442 = new Baekjoon2442();
        baekjoon2442.markStar();
    }

    private void markStar() {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N-i; j++){
                stringBuilder.append(" ");
            }
            for(int j=1; j<=i*2-1; j++){
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
