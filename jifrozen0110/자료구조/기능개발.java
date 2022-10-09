import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int day = ((100 - progresses[i]) / speeds[i]) + ((((100 - progresses[i]) % speeds[i]) > 0) ? 1 : 0);
            q.offer(day);
        }

        int first = q.poll();
        int ans = 1;
        while (!q.isEmpty()) {
            if (first < q.peek()) {
                arr.add(ans);
                ans = 1;
                first = q.poll();
            } else {
                ans++;
                q.poll();
            }
        }
        arr.add(ans);

        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}