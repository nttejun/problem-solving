package resolve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgLevel1KValue {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        for(int i=0; i<commands.length; i++){
            int start = commands[i][1];
            int end = commands[i][2];

            List<Integer> list = new ArrayList();
            for(int j=start; j<end; j++){
                list.add(commands[i][j]);
            }
            Arrays.sort(new List[]{list});
            System.out.println(list.toString());
        }
        return answer;
    }

    public static void main(String[] args){

        int ary[] = {1, 5, 2, 6, 3, 7, 4};
        int com[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        ProgLevel1KValue p = new ProgLevel1KValue();
        p.solution(ary, com);
    }

}
