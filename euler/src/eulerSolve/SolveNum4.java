package eulerSolve;

import java.util.Scanner;

/**
 * Created by nttej on 2017-07-27.
 */
public class SolveNum4 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("2진수를 입력해주세요 : ");
        String binary = scan.nextLine();

        int total = 0;
        int squared = 1;

        for(int a = binary.length(); a > 0; a --){
            String str = binary.substring(a-1, a);

            if(Integer.parseInt(str) >= 2){
                System.out.println("입력값이 2진수가 아닙니다");
                break;
            }

            total = total + (squared * Integer.parseInt(str));  // 2^n * binary Number

            squared= squared * 2 ;
        }

        System.out.println("10진수 : " + total);
    }
}

}
