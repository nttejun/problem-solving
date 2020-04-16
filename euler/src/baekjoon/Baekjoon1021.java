package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1021 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        boolean validate = false;

        int N = 0;
        int M = 0;


        while (validate == false){
            N = Integer.parseInt(br.readLine());
            if(N <= 50){
                validate = true;
                builder.append(N);
            }
        }

        validate = false;

        while (validate == false){
            M = Integer.parseInt(br.readLine());
            if(0 <= M && M <= N){
                validate = true;
                builder.append(" ");
                builder.append(M+"\n");
            }
        }


        int[] selNum = new int[M];
        for(int i=0; i<M; i++){
            int temp = 0;
            validate = false;
            while(validate == false){
                temp = Integer.parseInt(br.readLine());
                // 똑같은 숫자 입력 검증 필요
                if(0 <= temp && temp <= N){
                    selNum[i] = temp;
                    builder.append(temp);
                    builder.append(" ");
                    validate = true;
                }
            }
        }

        System.out.println(builder.toString());

    }
}
