package resolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1021 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        boolean validate = false;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        while (validate == false){
            if(N <= 50){
                validate = true;
                builder.append(N);
            }
        }

        validate = false;

        while (validate == false){
            if(0 <= M && M <= N){
                validate = true;
                builder.append(" ");
                builder.append(M);
            }
        }

        System.out.println(builder.toString());

    }
}