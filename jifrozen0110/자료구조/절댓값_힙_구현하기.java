package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 절댓값_힙_구현하기 {
	public static void main(String [] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N=Integer.parseInt(br.readLine());

		PriorityQueue<Integer> q=new PriorityQueue<>((o1,o2)-> {
			int a=Math.abs(o1);
			int b=Math.abs(o2);
			if(a==b){
				return o1>o2?1:-1;
			}else{
				return a>b?1:-1;
			}
		});

		StringBuilder sb=new StringBuilder();

		for(int i=0;i<N;i++){
			int now=Integer.parseInt(br.readLine());
			if(now==0){
				if(!q.isEmpty()) {
					sb.append(q.poll());
					sb.append("\n");
				}else{
					sb.append(0);
					sb.append("\n");
				}
			}else{
				q.add(now);
			}
		}

		System.out.println(sb);


	}
}
