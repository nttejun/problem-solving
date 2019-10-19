package resolve;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Crema02 {
    /*
     * Complete the 'getMostVisited' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY sprints
     */


    public static int getMostVisited(int n, List<Integer> sprints) {

        List<Integer> visitCount = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            visitCount.add(0);
        }
        
        for (int i = 0; i < sprints.size() - 1; i++) {

            if (sprints.get(i) < sprints.get(i+1)) {
                for (int j = sprints.get(i); j <= sprints.get(i + 1); j++) {
                    visitCount.set(j, visitCount.get(j) + 1);
                }
            } else {
                for (int j = sprints.get(i); j >= sprints.get(i + 1); j--) {
                    visitCount.set(j, visitCount.get(j) + 1);
                }
            }
        }

        int maxValue = 0;
        int maxIndex = visitCount.get(0);
        for (int i = 0; i < visitCount.size(); i++) {
            if (maxValue < visitCount.get(i)) {
                maxValue = visitCount.get(i);
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    @Test
    public void testSampleCase1() {
        int n = 10;
        List<Integer> sprints = Arrays.asList(1, 5, 10, 3);
        assertEquals(5, getMostVisited(n, sprints));
    }

    @Test
    public void testSampleCase2(){
        int n = 9;
        List<Integer> sprints = Arrays.asList(9, 7 ,3 ,1);
        assertEquals(3, getMostVisited(n, sprints));
    }
}