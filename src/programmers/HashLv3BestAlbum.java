package programmers;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashLv3BestAlbum {

    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        return answer;
    }

    @Test
    public void TEST_성공케이스() {
        String[] genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
        String[] genresUnique = new String[genres.length];
        int[] plays = new int[]{500, 600, 150, 800, 2500};

        Map<String, Integer> genresKey = new HashMap<>();
        Map<String, Integer> uniqueNumberKey = new HashMap<>();

        for(int i=0; i<genres.length; i++) {
            genresKey.put(genres[i]+i, plays[i]);
            uniqueNumberKey.put(genres[i]+i, i);
            genresUnique[i] = genres[i]+i + i;
        }

        List<Map.Entry<String, Integer>> genresKeyList = new LinkedList<>(genresKey.entrySet());
        genresKeyList.sort(Map.Entry.comparingByValue());

        List<Map.Entry<String, Integer>> uniqueNumberKeyList = new LinkedList<>(uniqueNumberKey.entrySet());
        uniqueNumberKeyList.sort(Map.Entry.comparingByValue());

        for(Map.Entry<String, Integer> entry : genresKeyList){
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
        }

        for(Map.Entry<String, Integer> entry : uniqueNumberKeyList){
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
        }
    }
}
