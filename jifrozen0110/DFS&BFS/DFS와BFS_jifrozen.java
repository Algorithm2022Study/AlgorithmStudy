package DFS_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class DFS와BFS {
	public static boolean[] visited;
	static List<Integer> DFS=new ArrayList<>();
	static List<Integer> BFS=new ArrayList<>();
	static int[][] arr;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();   // 정점의 개수
		int M = scan.nextInt();   // 간선의 개수
		int V = scan.nextInt();   // 탐색을 시작할 정점 번호

		//인접행렬 생성
		arr = new int[N+1][N+1];
		for(int i = 0; i < M; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		visited = new boolean[N + 1];
		dfs(V);

		System.out.println();

		visited = new boolean[N + 1];
		bfs(V);


	}
	public static void bfs(int start){
		Queue<Integer> q=new LinkedList<>();
		q.offer(start);
		visited[start]=true;
		System.out.print(start+" ");

		while(!q.isEmpty()) {
			int x = q.poll();
			for (int i = 0; i < arr[x].length; i++) {
				if (arr[start][i]==1&&!visited[i]) {
					q.offer(i);
					visited[i] = true;
					System.out.print(i+" ");
				}
			}
		}
	}
	public static void dfs(int start){
		visited[start]=true;
		System.out.print(start+" ");
		if(start == arr.length) {
			return;
		}
		for(int i=0;i<arr[start].length;i++){
			if(arr[start][i]==1&&!visited[i]) dfs(i);
		}
	}
}
