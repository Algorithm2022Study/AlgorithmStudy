package overthename.그래프;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class P1043_거짓말 {
	public static int[] parent;
	public static int[] tp;
	public static ArrayList<Integer>[] party;
	public  static int result;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		result=0;
		tp = new int[t];
		for (int i = 0; i < t; i++) {
			tp[i] = sc.nextInt();
		}

		party = new ArrayList[m];
		for (int i = 1; i < m; i++) {
			party[i]= new ArrayList<Integer>();
			int size=sc.nextInt();
			for(int j=0; j<size;j++){
				party[i].add(sc.nextInt());
			}
		}

		parent = new int[n + 1];
		for (int i = 1; i < m; i++) {
			parent[i] = i;
		}

		//각 파티에 참여한 사람들을 1개의 그룹으로 만들기
		//1개의 파티에 있는 모든 사람들은 같은 대표 노드를 바라보게 된다.
		for(int i=0; i<m; i++){
			int first = party[i].get(0);
			for(int j=1; j<party[i].size();j++){
				union(first,party[i].get(j));
			}
		}

		//각 파티의 대표 노드와 진실은 아는 사람들의 대표 노드가 같다면 과장할 수 없음
		for( int i=0; i<m; i++){
			boolean ispossible = true;
			int value = party[i].get(0);
			for(int j=0; j< tp.length; j++){
				if(find(value)==find(tp[j])){
					ispossible=false;
					break;
				}
			}
			if (ispossible) result++;
		}
		System.out.println(result);
	}

	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a!=b){
			parent[b]=a;
		}
	}

	public static int find(int a) {
		if (a == parent[a]) {
			return a;
		} else {
			return parent[a] = find(parent[a]);
		}
	}

}

