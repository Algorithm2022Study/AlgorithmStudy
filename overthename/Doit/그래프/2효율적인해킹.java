package overthename.그래프;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P1325_효율적인해킹 {
	static ArrayList<Integer>[] A;
	static boolean visited[];
	static int n,m;
	static int answer[];

	public static  void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		A= new ArrayList[n+1];
		answer = new int[n+1];
		for(int i=1; i<=n; i++){
			A[i]= new ArrayList<>();
		}
		for(int i=0; i<m; i++){
			st= new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
		}

		//모든 노드 실행
		for(int i=1; i<=n; i++){
			visited = new boolean[n+1];
			BFS(i);
		}

		int max=0;
		for(int i=1; i<=n; i++){
			max= Math.max(max,answer[i]);
		}
		for(int i=1; i<=n; i++){
			if(answer[i]==max){
				System.out.print(i+" ");
			}
		}



	}
	static void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		visited[v]=true;

		while(!queue.isEmpty()){
			int now= queue.poll();
			for(int i : A[now]){
				if(visited[i]==false){
					visited[i]=true;
					answer[i]++;
					queue.add(i);
				}
			}
		}
	}
}
