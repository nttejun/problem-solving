
package resolve;

import java.math.BigInteger;

public class SolveNum3 {

	public static void main(String[] args) {

		long value = 600851475143L;
		System.out.println(decimal(value));

	}
	
	public static long decimal(long value) {

        long primeMax = 0;

        for (long n = 2; n < value; n++) {

            if (value % n == 0) { // 분해 가능 시

                boolean checkPrime = true;

                for (int a = 2; a < n; a++) { // 소수 검증

                    if (n % a == 0) { // 소수 탈락

                        checkPrime = false;

                    }

                }

                if (checkPrime == true) { // 소수 성공

                    primeMax = n;   // 소수 등록

                    System.out.println(primeMax);

                    while (value % n == 0) { // 분해 가능할 때 까지 분해

                        value = value / n;

                    }
                }
            }
        }

        if(value > primeMax){

            primeMax = value;

        }

        return primeMax;

	}

}

