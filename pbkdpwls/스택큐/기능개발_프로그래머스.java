import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        // 정해진 순서대로 배포가 가능해서 현재 기능이 완료되어도 앞의 기능이 완료되지 않으면 배포 불가능
        // 따라서 입력 순서대로 반환하는 큐 사용
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<progresses.length;i++) {
            // 계산이 완료되는 시간 계산 : java에서 int끼리의 연산 결과는 int라 100.0 사용. 반올림도 해줌(5.5일이면 6일이 배포일이기때문)
            queue.add((int) (Math.ceil((100.0-progresses[i]) / speeds[i])));
        }

        // 정답 배열 생성, 유동적으로 추가 가능한 ArrayList 사용
        List<Integer> answer = new ArrayList<>();
        while (!queue.isEmpty()){ // 큐가 빌때까지 계속 반복
            int day = queue.poll(); // 가장 앞의 값 꺼내옴
            int cnt = 1;

            // 큐에 남아있는 값 중에서, 현재 기능의 계산 완료 시간보다 작거나 같은 것(이미 구현 완료되었는데 앞 기능 기다리는 것들) 빼내오고, 카운트 세줌
            while(!queue.isEmpty() && day >= queue.peek()) {
                cnt++;
                queue.poll();
            }
            answer.add(cnt); // 카운트 값 정답배열에 추가
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}