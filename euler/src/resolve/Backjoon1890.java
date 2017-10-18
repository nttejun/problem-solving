package resolve;

import java.util.Scanner;

/**
 * Created by nttej on 2017-10-17.
 */

public class Backjoon1890 {

    private int[][] d;
    private int[][] m;
    private int pan;

    public void setData(int panData){

        this.pan = panData;
        this.m = new int[101][101];
        this.d = new int[101][101];
    }

    public void setM(int value, int i, int j){

        this.m[i][j] = value;

    }

    public int move(int y, int x){

        if(y == pan-1 && x == pan-1){
            return 1;
        }

        if(y >= pan || x >= pan){
            return 0;
        }

        return move(y + m[y][x], x) + move(y, x + m[y][x]);

    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int pan = scan.nextInt();

        Backjoon1890 main = new Backjoon1890();
        main.setData(pan);

        int[][] panLow = new int[pan][pan];


        for(int i = 0; i < pan; i++){

            for(int j = 0; j < pan; j++){
                main.setM(scan.nextInt(), i, j);
            }

            if(i==pan-1){
                panLow[i][pan-1] = 0;
            }

        }

        System.out.println(main.move(0,0));

    }

}
