package 자료구조;

import java.util.*;

class Solution {
    static class Node {
        int value;
        int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        Queue<Node> q = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
            q.add(new Node(priorities[i], i));
        }

        while (true) {
            int pqNode = pq.peek();
            Node qNode = q.poll();
            if (pqNode == qNode.value) {
                answer++;
                if (qNode.index == location)
                    break;
                pq.poll();
            } else {
                q.add(qNode);
            }
        }

        return answer;
    }
}
