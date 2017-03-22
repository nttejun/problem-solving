package sort;

public class SelectionSort {

	public static void main(String[] args) {

		int[] a = {10, 900, 500, 33, 77, 200, 100, 30, 15};

		for(int value=0; value<a.length; value++){
			for(int rotation=value+1; rotation<a.length; rotation++){
				if(a[rotation]<a[value]){
					int changeValue = a[rotation];
					a[rotation] = a[value];
					a[value] = changeValue;
				}
			} 
		}
		for(int index=0; index<a.length; index++)
			System.out.println(a[index]);
	}
}
