package resolve;

public class SolveNum1 {

	public static void main(String[] args) {
		// 10���� ���� �ڿ��� �� 3�Ǵ� 5�� ����� 3,5,6,9 �̰�, �̰��� ��� ���ϸ� 23�Դϴ�
		// 1000���� ���� �ڿ��� �� 3 �Ǵ� 5�� ����� ��� ���ϸ� ���ϱ�� ?

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
