import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int min = 0;

        for (int max = people.length-1; min<=max; max--) {
            if ((people[max]+people[min])<=limit) min++; // 더해도 리밋보다 작을 때, min 누적 (범위 줄임)
            answer++;
        }

        return answer;
    }
}