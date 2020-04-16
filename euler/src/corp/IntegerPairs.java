package corp;

import java.util.Scanner;

/**
 * Created by nttej on 2017-08-10.
 */

// (가정)
// N개의 정수 주어졌다
// 그 차가 K인 정수 쌍의 수

// 첫째 줄에 N, K 입력 >> 스페이스로 구분한다
// 둘째 줄부터 N개의 정수 입력 >> 단 모든 정수는 그 값이 서로 달라야 한다 >> 스페이스로 구분

// (출력)
// 차가 K인 쌍의 수를 출력

// (조건)
// N <= 10^5
// 0 < K < 10^9
// 각 정수는 0 보다 크고 2^31 - 1 보다 작다

public class IntegerPairs {

    public static void main(String[] args) {

        IntegerPairs pairs = new IntegerPairs();

        pairs.findParis();

    }

    private int numN;
    private int numK;

    private void findParis() {

        setNumNK(toInts(split(scan())));

        System.out.println("출력결과 = " + pairsCalculator(toInts(split(scan()), getNumN())));

    }

    private String scan() {

        Scanner scan = new Scanner(System.in);

        System.out.println("입력해 주세요");

        String inputNK = scan.nextLine();

        return inputNK;

    }

    private String[] split(String inputData) {

        String[] stringData = inputData.split(" ");

        return stringData;

    }

    private int[] toInts(String[] StringData) {

        int[] toNum = new int[StringData.length];

        for (int index = 0; index < StringData.length; index++) {

            toNum[index] = Integer.parseInt(StringData[index]);

        }

        return toNum;

    }


    private int[] toInts(String[] StringData, int numN) {

        int[] toNum = new int[StringData.length];

        for (int index = 0; index < StringData.length; index++) {

            toNum[index] = checkRangeN(Integer.parseInt(StringData[index]));

        }

        checkLengthN(toNum, numN);

        return toNum;

    }

    private int[] checkLengthN(int[] toNum, int numN){

        if (toNum.length != numN) {

            return toInts(split(scan()), getNumN());

        }   // if the input numbers is not equal to the numN go to the scan method

        return toNum;

    }

    private int checkRangeN(int checN){

        if(checN < 0 || checN > 2147483647){

            toInts(split(scan()), getNumN());

        }

        return checN;

    }

    private int pairsCalculator(int[] toNum){

        int result = 0;

        for (int a = 1; a < toNum.length; a++) { // insertion algorithm

            for (int b = 0; b < a; b++) {

                if (toNum[a] == toNum[b]) {   // if you have two identical equal value go to the scan method

                    toInts(split(scan()), getNumN());

                }

                if ( ( toNum[a] - toNum[b] == getNumK() ) || ( toNum[b] - toNum[a] == getNumK()) ) {

                    result++;

                }

            }

        }

        return result;

    }

    private int getNumN() {
        return numN;
    }

    private int getNumK(){
        return numK;
    }

    private void setNumNK(int[] numNK) {

        checkRange(numNK);

        this.numN = numNK[0];
        this.numK = numNK[1];
    }

    private int[] checkRange(int[] numNK){

        if(numNK[0] > 100000){ return toInts(split(scan())); }

        if(numNK[1] > 1000000000){ return toInts(split(scan())); }

        return numNK;

    }


}
