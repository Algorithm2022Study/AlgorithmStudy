package 그래프;

import java.util.Scanner;

public class 여행계획짜기 {

	public static int[] parent;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		parent = new int[N+1];

		parent = new int[N+1];

		for(int i=1; i<=N;i++) {
			parent[i]=i;
		}


		int [][] dosi = new int[N+1][N+1];
		//도시 데이터
		for(int i=1; i<=N;i++) {
			for(int j=1; j<=N;j++) {
				dosi[i][j]= sc.nextInt();
			}
		}
		//여행 도시
		int[] route = new int[M+1];
		for(int i=1; i<=M;i++) {
			route[i]=sc.nextInt();
		}

		for(int i=1; i<=N;i++) {
			for(int j=1; j<=N;j++) {
				if(dosi[i][j]==1) union(i,j);
			}
		}

		//여행 계획 도시들이 1개의 대표 도시로 연결돼 있는지 확인
		int index = find(route[1]);
		for(int i=2; i<route.length;i++) {

			if(index != find(route[i])){
				System.out.println("NO");
				return;
			}}

		System.out.println("YES");



	}

	public static void union(int a,int b) {

		if(find(a)!=find(b)) {
			parent[find(b)]=find(a);
		}
	}

	public static int find(int a) {
		if(a==parent[a])return a;
		else return parent[a]=find(parent[a]);
	}


}
