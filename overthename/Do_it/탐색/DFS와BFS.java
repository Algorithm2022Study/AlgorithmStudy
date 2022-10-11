package 탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.swing.text.View;

public class DFS와BFS {
	static boolean visited[];
	static ArrayList<Integer>[] A;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

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

		//번호가 작은 것을 먼저 방문하기 위해 정렬
		for(int i=1;i<=N;i++){
			Collections.sort(A[i]);
		}

		//방문 배열 초기화하기
		visited = new boolean[N+1];

		//DFS수행
		DFS(V);
		System.out.println();

		//BFS수행
		visited = new boolean[N+1];
		BFS(V);
		System.out.println();

	}

	public static void DFS(int v){
		System.out.print(v+" ");
		visited[v]=true;
		for(int i: A[v]){
		if(visited[i]==false){
			DFS(i);
		}}

	}

	public static void BFS(int v){

		//큐 초기화
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(v);
		visited[v]=true; //1

		//선입선출 방식
		//빌 떄까지
		while(!q.isEmpty()){
			//젤 처음 원소를 꺼낸다.
			int n=q.poll(); //1 2 3 5
			System.out.print(n+" ");//1 2 3 5 6 4
			//리스트에 있는 값중 가지 않을 것만 갔다고 표시하고 큐에 넣기
			for(int i: A[n]){ //2,3  5,6 4
				if(!visited[i]){
					visited[i]=true;
					q.add(i);	}
			}
		}
	}
}
