package eulerSolve;

public class SolveNum2 {

	public static void main(String[] args) {
		// 피보나치 수열 짝수 4백만 이하인 모든 할을 더하면 얼마입니까?
		
		int maxNum = 4000000;
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int stepNum = 2;

		for (int i = 0; i <= maxNum; i++) {

			if (num3 <= maxNum) {
				num3 = num1 + num2;
				if (num3 % 2 == 0) {
					stepNum = stepNum + num3;
				}
				num1 = num2;
				num2 = num3;
			}
		}

		System.out.println(stepNum);
	}

}
