package sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] sort = { 900, 700, 500, 150, 40, 50, 100, 200, 600, 800, 1000 };
		StartSort(sort, 11);
	}
	 
		static void StartSort(int[] sort, int sortLength) {
		for(int rotation = 1; rotation <= sortLength; rotation++) {
			for (int value = 0; value < sortLength-rotation; value++) {
				int smallValue = 0;
				if (sort[value] > sort[value+1]) {
					smallValue = sort[value+1];
					sort[value+1] = sort[value];
					sort[value] = smallValue;
				}
			}
		}
		for(int index=0; index<sortLength; index++){
			System.out.println(sort[index]);
		}
	}
}
	

