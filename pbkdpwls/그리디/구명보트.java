import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int max = people.length-1; // max 값 인덱스
        int min=0; // min 값 인덱스

        Arrays.sort(people);

        while(max>=0 && max>=min){
            if(people[min]+people[max]<=limit) {
                answer++;
                min++;

                if(max==1){
                    break;
                }
            }
            else {
                answer++;
            }
            max--;
        }

        return answer;
    }
}