package corp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nttej on 2017-10-11.
 */

// 네자리수 (1000) 주어진다 >> 맨앞 0의 자리 불가
// before 값에서 한번에 한자리씩 변경하며 after 값으로 변경해야한다
// 8, 1, 7 ,9 추출
// 한 자리만 선택한다 >> 한 자리를 변경한다 >> 소수가 되면 after 숫자 >> 소수가 안되면 다른 숫자
// 1033 1733 3733 3739 3779 8779 8179

public class DemicalPath {

  private int before;
  private int after;

  public void setNumber(int unchangeNumber, int changeNumber) {

    this.before = unchangeNumber;
    this.after = changeNumber;

  }

  public ArrayList<Integer> passwordDivision(int after) {  // 번호 분해

    List<Integer> division = new ArrayList<>();

    int divideNumber = after;

    int result = 0;

    while (divideNumber != 0) {

      result = divideNumber % 10;

      divideNumber = divideNumber / 10;

      division.add(result);

    }

    return (ArrayList<Integer>) division;

  }

  public int passwordMerge(ArrayList<Integer> number) {

    int merge = 0;

    int result = 0;

    int multiply = 1;

    for (int a = 0; a < number.size(); a++) {

      result = number.get(a) * multiply;

      merge = merge + result;

      System.out.println(merge);

      multiply = multiply * 10;

    }

    return merge;

  }

  public int demicalConfirm(int fail, int success) { // 소수 체크

    if (success % 2 != 0 && success % 3 != 0) {

      return success;

    }

    return fail;

  }

  public void play() {

  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("첫번째 입력");
    int unchangeNumber = scanner.nextInt();
    System.out.println("두번째 입력");
    int changeNumber = scanner.nextInt();

    DemicalPath demicalPath = new DemicalPath();
    demicalPath.setNumber(unchangeNumber, changeNumber);
    demicalPath.play();
  }
}
