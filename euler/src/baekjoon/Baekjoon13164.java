package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon13164 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // 유치원생의 수
        int N = scan.nextInt();

        // 조의 개수
        int K = scan.nextInt();

        int[] key = new int[N];
        for(int i = 0; i < N; i++){
            key[i] = scan.nextInt();
        }

        int[] list = new int[N-1];

        // 전체 비용
        int sum = 0;
        for(int i = 1; i < N; i++){
            list[i-1] = (key[i]-key[i-1]);
            sum += list[i-1];
        }

        // 비용 정렬
        Arrays.sort(list);

        // 큰 비용부터 K개씩 비용
        int fee = 0;
        for(int i = 0; i < K-1; i++){
            sum = sum - list[list.length-i-1];
        }
        System.out.println(sum);
    }
}
