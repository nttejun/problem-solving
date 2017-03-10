package eulerSolve;

public class SolveNum1 {

	public static void main(String[] args) {
		// 10보다 작은 자연수 중 3또는 5의 배수는 3,5,6,9 이고, 이것을 모두 더하면 23입니다
		// 1000보다 작은 자연수 중 3 또는 5의 배수를 모두 더하면 얼마일까요 ?

		int sum = 0;
		int result = 0;
	
		for (int i = 0; i <= 999; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("최종 합= " + sum);
	}

}
