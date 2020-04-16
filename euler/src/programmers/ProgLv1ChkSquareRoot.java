package programmers;

public class ProgLv1ChkSquareRoot {
    public long solution(long n) {
        long max = n / 2;
        for (int i = 0; i <= max; i++) {
            if (i * i == n) {
                return (i + 1) * (i + 1);
            }
        }
        return -1;
    }

    public long solution1(long n) {
        long sqrt = (long) Math.sqrt(n);
        if(sqrt*sqrt == n){
            return (sqrt + 1) * (sqrt + 1);
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        ProgLv1ChkSquareRoot progLv1ChkSquareRoot = new ProgLv1ChkSquareRoot();
        System.out.println(progLv1ChkSquareRoot.solution1(11));
    }
}
