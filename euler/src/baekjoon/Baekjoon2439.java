package baekjoon;

import java.util.Scanner;

public class Baekjoon2439 {
    public static void main(String[] args){
        Baekjoon2439 baekjoon2439 = new Baekjoon2439();
        baekjoon2439.makeStar();
    }

    public void makeStar() {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 1; i <= N; i++){
            for(int j = i; j < N; j++){
                stringBuilder.append(" ");
            }
            for(int j = 0; j < i; j++){
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
