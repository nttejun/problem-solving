package corp;

public class SolveNum1 {

	public static void main(String[] args) {

		int sum = 0;
		int result = 0;
	
		for (int i = 0; i <= 999; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("���� ��= " + sum);
	}

}
