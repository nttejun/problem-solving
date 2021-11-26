package sorting;

public class InsertionSort {

  public static void main(String[] args) {

    int min = 0;
    int[] array = {100, 3, 500, 1, 8, 600, 2, 400, 15, 80};

    for (int n = 0; n < array.length; n++) {

      for (int i = n + 1; i < array.length; i++) {
        if (array[i] < array[n]) {
          min = array[i];
          array[i] = array[n];
          array[n] = min;
        }
      }
    }
    for (int index = 0; index < array.length; index++) {
      System.out.println(array[index]);
    }
  }
}
