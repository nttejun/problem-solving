package resolve;

import java.util.Scanner;

public class Baekjoon2441 {
    public static void main(String[] args){
        Baekjoon2441 baekjoon2441 = new Baekjoon2441();
        baekjoon2441.markStar();
    }

    private void markStar() {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=1; i<=N; i++){
            for(int j=1; j<i; j++){
                stringBuilder.append(" ");
            }
            for(int j=i; j<=N; j++){
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
