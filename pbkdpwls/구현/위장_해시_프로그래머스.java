import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String,Integer> hash = new HashMap<String,Integer>();

        for (int i=0;i<clothes.length;i++) {
            String key = clothes[i][1];
            if (!hash.containsKey(key)){
                hash.put(key,1);
            }
            else {
                hash.put(key, hash.get(key)+1);
            }
        }

        Set<String> keySet = hash.keySet();

        for (String key : keySet) {
            System.out.println(key + " : " + hash.get(key));
            answer*=(hash.get(key)+1);
        }

        return answer-1;
    }
}