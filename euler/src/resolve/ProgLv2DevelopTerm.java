package resolve;

public class ProgLv2DevelopTerm {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        int[] prog = new int[progresses.length];
        int[] days = new int[progresses.length];
        int count = 0;
        int n = 0;

        for (int i = 0; i < progresses.length; i++) {

            prog[i] = 100 - progresses[i];

            count = 0;
            n = speeds[i];

            for (int j = 0; j < 101; j++) {

                count++;

                if (prog[i] < n) {
                    days[i] = count;
                    j = 101;
                }

                n = n + speeds[i];

            }
        }

        int index = 0;
        count = 0;

        for(int i = 0; i < progresses.length-1; i++){
            if(days[index] > days[i+1]){
                count++;
            } else {
                answer[i] = count;
                System.out.println(count);
                index = index + count;
                count = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        ProgLv2DevelopTerm p = new ProgLv2DevelopTerm();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        p.solution(progresses, speeds);
    }
}
