package 탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 연결요소의개수 {
	static boolean visited[];
	static ArrayList<Integer>[] A;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		//인접리스트 초기화
		A = new ArrayList[N+1];
		for(int i=1;i<=N;i++){
			A[i]= new ArrayList<Integer>();
		}

		//원소값 넣기
		for(int i=0;i<M;i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			A[a].add(b);
			A[b].add(a);
		}

		//방문 배열 초기화하기
		visited = new boolean[N+1];

		int count=0;
		for(int i=1;i<N+1;i++){
			if(visited[i]==false){
					DFS(i);
					count++;}
		}

		System.out.println(count);


	}

	public static void DFS(int v){
		if(visited[v]){return;}
		visited[v]=true;
		for(int i: A[v]){
		if(visited[i]==false){
			DFS(i);
		}}

	}

}
