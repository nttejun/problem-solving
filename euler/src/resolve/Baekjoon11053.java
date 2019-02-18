package resolve;

import java.util.Scanner;

public class Baekjoon11053 {
    public static void main(String[] args){
        Baekjoon11053 baekjoon11053 = new Baekjoon11053();
        baekjoon11053.start();
    }

    private void start() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if(N < 1 || N > 1000) return;

        int temp = 0;
        int length = 0;
        int max = 0;

        for(int i=0; i<N; i++){
            temp = scan.nextInt();
            if(temp < 1 || temp > 1000) return;
            if(max < temp){
                max = temp;
                length++;
            }
        }
        System.out.println(length);
    }
}
