package corp;

import org.junit.Test;

public class Kobit02 {
  public int solution(int[] arr, int num){
    int count = 0;
    int carry = 0;

    for(int i=0; i<arr.length; i++){
      if(arr[i] != 0 || carry != 0){
        carry += arr[i] - num;
        count++;
        if(carry < 0) carry = 0;
      }
    }

    while (carry > 0){
      count++;
      carry -= num;
    }

    return count;
  }

  @Test
  public void TEST_01(){
    int[] i = new int[]{10,0,0,4,20};
    int num = 8;
    solution(i,num);
    System.out.println(solution(new int[] { 10, 0, 0, 4, 20 }, 8));
    System.out.println(solution(new int[] { 0, 0, 0 }, 10));
    System.out.println(solution(new int[] { 100, 100 }, 10));
    System.out.println(solution(new int[] { 27, 0, 0, 0, 0, 9 }, 9));
    System.out.println(solution(new int[] { 6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5, 6 }, 3));
  }

}
