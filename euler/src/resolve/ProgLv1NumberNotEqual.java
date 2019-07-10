package resolve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProgLv1NumberNotEqual {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            answer.add(arr[i]);
            int size = answer.size()-1;
            System.out.println("size : " + answer.size());
            for (int j = 0; j < size; j++) {
                if (arr[i] == answer.get(j)) {
                    System.out.println( " >>>> " + answer.get(size));
                    answer.remove(size);
                    break;
                }
            }
        }


        int[] result = new int[answer.size()];
        Iterator iterator = answer.iterator();
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) iterator.next();
        }
        return result;
    }

    public static void main(String[] args){

        ProgLv1NumberNotEqual p = new ProgLv1NumberNotEqual();
        int[] a = {1, 20, 20, 4, 4, 30};
        System.out.println(p.solution(a));
    }
}
