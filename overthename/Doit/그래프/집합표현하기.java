package 그래프;

import java.util.Scanner;

public class 집합표현하기 {

	public static int[] parent;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		parent = new int[N+1];

		for(int i=0; i<N;i++) {
			parent[i]=i;
		}


		for(int i=0; i<M;i++) {
			int q = sc.nextInt();
			int A= sc.nextInt();
			int B= sc.nextInt();
			if(q==0) {
				union(A,B);
			}else {
				if(checkSame(A,B)){
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}


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

	public static boolean checkSame(int a,int b) {
		if(find(a)==find(b)) {
			return true;
		}else {
			return false;
		}
	}
}

