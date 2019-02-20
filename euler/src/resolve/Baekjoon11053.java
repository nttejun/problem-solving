package resolve;

import java.util.Scanner;

public class Baekjoon11053 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n][2];
        int max = 1;

        for(int i=0; i<n; i++){
            dp[i][0] = 1;
            dp[i][1] = sc.nextInt();
            for(int ii = 0; ii < i; ii++){
                if(dp[ii][1] < dp[i][1])
                    dp[i][0] = Math.max(dp[i][0], dp[ii][0] + 1);
            }
            max = max < dp[i][0] ? dp[i][0] : max;
        }
        System.out.println(max);
    }
}
