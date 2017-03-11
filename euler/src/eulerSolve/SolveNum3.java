package eulerSolve;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class SolveNum3 {

	public static void main(String[] args) {
		// 600851475143 풀어야할 소인수분해
		
		Boolean check = false;
		BigInteger bigPrimeNumber = new BigInteger("600851475143");		
		decimal();
	}
	
	public static int[] decimal() {
		int[] ableNum;
		int index=0;
		Boolean check = true;
		
		
		
		for (int i=2; i<100; i++) {
			check = true;
			for (int k=2; k<i; k++) {
				if (i%k == 0) {
					check = false;
				}
			}
			if (check == true) {
				ableNum[index]=i;
				index++;
			}
		}
		return ableNum;
	}
}
