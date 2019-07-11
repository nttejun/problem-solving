package resolve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProgLv1NumberNotEqual {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            answer.add(arr[i]);
            int size = answer.size()-1;
            if (answer.get(size-1) == answer.get(size)) {
                answer.remove(size);
            }
        }


        int[] result = new int[answer.size()];
        Iterator iterator = answer.iterator();
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) iterator.next();
        }
        return result;
    }

    public int[] solution1(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=0; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }
        int answer[] = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args){

        ProgLv1NumberNotEqual p = new ProgLv1NumberNotEqual();
        int[] a = {1, 20, 20, 4, 4, 30};
        // 결과 : 1, 20 ,4, 30

        p.solution(a);
        p.solution1(a);
    }
}
