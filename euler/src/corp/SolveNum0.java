package corp;

import java.util.ArrayList;

public class SolveNum0 {

	public static void main(String[] args) {

		ArrayList<Integer> print = decimalValue();
		System.out.println(print);
	}

	public static ArrayList<Integer> decimalValue() {
		ArrayList<Integer> decimal = new ArrayList<Integer>();
		int index = 0;
		Boolean check = true;
		
		for(int i=2; i<100; i++) {
			check = true;
			for(int k=2; k<i; k++) {
				if (i%k == 0) {
					check = false;
					break;
				}
			}
			if (check == true) {
				decimal.add(i);
				index++;
			}
		}
		return decimal;
	}
}

