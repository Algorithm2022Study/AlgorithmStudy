import java.util.*;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();

        Arrays.sort(elements);

        for (int i = 0; i < elements.length; i++) {
            set.add(elements[i]);
            for (int j = 0; j < elements.length; j++) {
                set.add(elements[i] + elements[j]);
            }
        }

        return set.size();
    }
}