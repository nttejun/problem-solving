package sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args){

        System.out.println("몇 개를 정렬하시겠습니까?");

        Scanner scan = new Scanner(System.in);

        int sortingNum = scan.nextInt();

        int[] sortList = new int[sortingNum];

        for(int time = 0; time < sortingNum; time++){

            System.out.println(time + "번 째 값을 입력해주세요");

            sortList[time] = scan.nextInt();

        }

        QuickSort quickSort = new QuickSort();

        quickSort.doSorting(sortList);

    }

    public static void doSorting(int[] sortList){

        doSorting(sortList, 0, sortList.length-1);

    }

    public static void doSorting(int[] sortList, int left, int right){

        if(left >= right || sortList.length == 0){return;}

        int pivot = sortList[(left + right) / 2];
        int index = partition(sortList, left, right, pivot);

        doSorting(sortList, left, index-1); // 0 - index
        doSorting(sortList, index, right); // index - right
    }

    public static int partition(int[] sortList, int left, int right, int pivot){

        while(left <= right){

            while(pivot > sortList[left]) {
                left++;
            }

            while(pivot < sortList[right]){
                right--;
            }

            if(left <= right){

                int temp = sortList[left];
                sortList[left] = sortList[right];
                sortList[right] = temp;

                left++;
                right--;

            }

        }

        return left;

    }

}
