import java.util.*;
class Solution {
    static class Node{
        int value;
        int index;

        public Node(int index,int value){
            this.index=index;
            this.value=value;
        }

    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        Queue<Node> q=new LinkedList<>();

        for(int i=0;i<priorities.length;i++){
            pq.add(priorities[i]);
            q.add(new Node(i,priorities[i]));
        }
        int dist=0;
        while(!pq.isEmpty()){
            if(pq.peek()==q.peek().value){
                dist++;
                if(q.peek().index==location){
                    answer=dist;
                    break;
                }
                pq.poll();
                q.poll();
            }else{
                q.offer(q.poll());
            }
        }
        return answer;
    }
}