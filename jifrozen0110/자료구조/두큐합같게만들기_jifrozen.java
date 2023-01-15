package 2주차.0113;

import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        //1. 2개 큐 만들기
        Queue<Integer> q1=new LinkedList<Integer>();
        Queue<Integer> q2=new LinkedList<Integer>();
        //2. 각 큐의 합 구하기 (제한사항 보면 long type 고려 안내문)
        long q1Sum=0;
        long q2Sum=0;
        for(int i=0;i<queue1.length;i++){
            q1Sum+=queue1[i];
            q1.offer(queue1[i]);
            q2Sum+=queue2[i];
            q2.offer(queue2[i]);
        }
        //*2 -> 통과못함 *3 범위 넓혀주니 통과
        long n=queue1.length*3;
        //3. 큐 합 같게 만들기
        while(n-->0){
            if(q1Sum==q2Sum) break;//큐 합 같으면 종료
            //큐 합의 크기를 비교해 원소값 빼주고 넣어줌
            if(q1Sum>q2Sum){
                int num=q1.poll();
                q2.offer(num);
                q1Sum-=num;
                q2Sum+=num;
            }else{
                int num=q2.poll();
                q1.offer(num);
                q2Sum-=num;
                q1Sum+=num;
            }
            answer++;
        }
        //같지 않는경우 -1
        if(q1Sum!=q2Sum){
            answer=-1;
        }
        return answer;
    }
}