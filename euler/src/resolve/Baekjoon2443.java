package resolve;

import java.util.Scanner;

public class Baekjoon2443 {
    public static void main(String[] args){
        Baekjoon2443 baekjoon2443 = new Baekjoon2443();
        baekjoon2443.markStar();
    }

    private void markStar() {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=1; i<=N; i++){
            for(int j=N-i; j<N; j++) {
                stringBuilder.append(" ");
            }
            for(int j=i; j<=N; j++) {
                stringBuilder.append("*");
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
