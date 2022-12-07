package overthename.그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class P18352_특정거리도시찾기 {
	static ArrayList<Integer>[] A;
	static int visited[];
	static int n,m,k,x;
	static ArrayList<Integer> result;
	public static  void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int start = sc.nextInt();


		A = new ArrayList[n+1];
		result = new ArrayList<>();

		for(int i=1; i<n+1; i++){
			A[i]= new ArrayList<Integer>();
		}
		for(int i=0; i<m; i++){
			int s = sc.nextInt();
			int e = sc.nextInt();
			A[s].add(e);
		}

		visited = new int[n+1];
		for(int i=0; i<=n; i++){
			visited[i]=-1;
		}
		BFS(start);
		for(int i=0; i<=n;i++){
			if(visited[i]==k){
				result.add(i);
			}
		}
		//도시가 존재하지 않을 때
		if(result.isEmpty()){
			System.out.println("-1");
		}else{
			//k인 도시 오름차순 출력
			Collections.sort(result);
			for(int temp:result){
				System.out.println(temp);
			}
		}


	}
	static void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		visited[v]++;

		while(!queue.isEmpty()){
			int now= queue.poll();
			for(int i : A[now]){
				if(visited[i]==-1){
					visited[i]=visited[now]+1;
					queue.add(i);
				}
			}
		}
	}
}
