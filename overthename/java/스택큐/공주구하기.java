package stack_queue;
import java.util.*;

public class 공주구하기 {
	public int solution(int list, int k) {

		int answer=0;

		Queue<Integer> q = new LinkedList<>();

		for(int i=1; i<=list;i++) {
			q.add(i);
		}


		while(!q.isEmpty()) {
			for(int i=1; i<k;i++) {q.add(q.poll());}
			q.poll();
			if(q.size()==1) answer=q.poll();

		}


		return answer;
	}



	public static void main(String[] args) {
		공주구하기 T = new 공주구하기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int a = kb.nextInt();

		System.out.print(T.solution(n,a));}}

