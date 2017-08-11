package resolve;

import java.util.Scanner;

/**
 * Created by nttej on 2017-08-10.
 */

// 1 IntegerPairs

// (가정)
// N개의 정수 주어졌다
// 그 차가 K인 정수 쌍의 수

// (조건)
// 첫째 줄에 N, K 입력 >> 스페이스로 구분한다
// 둘째 줄부터 N개의 정수 입력 >> 단 모든 정수는 그 값이 서로 달라야 한다 >> 스페이스로 구분

// (출력)
// 차가 K인 쌍의 수를 출력

// (제한)
// N <= 10^5
// 0 < K < 10^9
// N 과 K 는 0 보다 크고 2^31 - 1 보다 작다

// 예제 입력 #1
// 5 2
// 1 5 3 4 2

// 예제 출력 #1
// 3

// 예제 입력 #2
// 10 1
// 363374326 364147530 61825163 1073065718 1281246024 1399469912 428047635 491595254 879792181 1069262793

// 예제 출력 #2
// 0

public class IntegerPairs {

    public static void main(String[] args) {

        IntegerPairs pairs = new IntegerPairs();

        pairs.findParis();

    }

    private int numN;
    private int numK;

    private void findParis() {

        setNumNK(toInts(split(scan())));

        toInts(split(scan()), getNumN());

    }

    private String scan() {

        Scanner scan = new Scanner(System.in);

        System.out.println("plz input Number");

        String inputNK = scan.nextLine();

        return inputNK;

    }

    public String[] split(String inputData) {

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

    public int toInts(String[] StringData, int numN) {

        int[] toNum = new int[StringData.length];

        for (int index = 0; index < StringData.length; index++) {

            toNum[index] = Integer.parseInt(StringData[index]);

        }

        if (toNum.length != numN) {

            toInts(split(scan()), getNumN());

        }   // if the input numbers is not equal to the numN go to the scan method

        int result = 0;

        for (int a = 1; a < toNum.length; a++) { // insertion algorithm

            for (int b = 0; b < a; b++) {

                if (toNum[a] == toNum[b]) {

                    toInts(split(scan()), getNumN());

                }   // if you have two identical equal value go to the scan method

                if ( ( toNum[a] - toNum[b] == getNumK() ) || ( toNum[b] - toNum[a] == getNumK()) ) {

                    result++;

                }

            }

        }

        return result;

    }

    private void setNumNK(int[] numNK) {
        this.numN = numNK[0];
        this.numK = numNK[1];
    }

    private int getNumN() {
        return numN;
    }

    private int getNumK(){
        return numK;
    }

}
