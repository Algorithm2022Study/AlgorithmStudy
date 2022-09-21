package Two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 최솟값_찾기 {
	static class Node {
		int value;
		int index;

		Node(int value,int index){
			this.index=index;
			this.value=value;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st=new StringTokenizer(br.readLine());

		int N=Integer.parseInt(st.nextToken());
		int L=Integer.parseInt(st.nextToken());

		st=new StringTokenizer(br.readLine());

		Deque<Node> q=new LinkedList<>();

		StringBuilder sb=new StringBuilder();


		for(int i=0;i<N;i++){
			int now=Integer.parseInt(st.nextToken());
			while(!q.isEmpty()&&q.getLast().value>now){
				q.removeLast();
			}
			q.add(new Node(now,i));
			if(q.getFirst().index<=i-L){
				q.removeFirst();
			}
			sb.append(q.getFirst().value+ " ");
		}

		System.out.println(sb);

	}
}
