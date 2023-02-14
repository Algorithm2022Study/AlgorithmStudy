package 6주차.0210;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 바이러스 {
	static int result=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N=Integer.parseInt(br.readLine());
		int pair=Integer.parseInt(br.readLine());

		int[][] arr=new int[N+1][N+1];
		StringTokenizer st;
		for(int i=0;i<pair;i++){
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			arr[a][b]=1;
			arr[b][a]=1;
		}
		boolean[] visited=new boolean[N+1];
		DFS(1,visited,arr);


		System.out.println(result-1);

	}

	public static void DFS(int start,boolean[] visited,int[][] arr){
		if(visited[start]) return;
		visited[start]=true;
		result++;
		for(int i=0;i<arr[start].length;i++){
			if(arr[start][i]==1&&!visited[i]) DFS(i,visited,arr);
		}
	}

}
