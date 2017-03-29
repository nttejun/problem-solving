package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShellSort {
	public static void main(String[] args) {
		int[] value = { 100, 300, 400, 1, 3, 4, 1000, 999, 2};
		int valueLength = 9;
		sortingStart(value, valueLength);
	}

	public static void sortingStart(int[] value, int valueLength) {
		int largest;
		int i, index;
		
		for(int change=valueLength/2; change>0; change=change/2){

			int temp=change;
			temp=valueLength-change;
			
			System.out.println("temp값 = "+temp);
			System.out.println("change 값 = " +change);
			
			for (i = 0; i < temp; i++) {
				if (value[i] > value[i + change]) {
					largest = value[i + change];
					value[i + change] = value[i];
					value[i] = largest;
					System.out.println("Success Before -> value[" + (i+change) + "] = " + value[i]+" -> After value["+i+"] = " +value[i]);
				}
			}
				for (index = 0; index < value.length; index++) {
				System.out.println("결과 value[" + index + "] = " + value[index]);
			}				
		}
	}
}
