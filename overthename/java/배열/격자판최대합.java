package main;
import java.util.*;
//0 1 2 3 4  n=5
public class Main {
	public  int solution(int n, int[][] list) {


		int answer=0;

		int[] hang=new int[n];

		//행 더하기
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				hang[i]+=list[i][j];

			}
		}

		return answer;
	}



	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] list = new int[n][n];
		list[0][]
		for(int j=0;j<n;j++) {
			for(int i=0;i<n;i++) {
				list[j][i]=kb.nextInt();
			}}

		System.out.print(T.solution(n,list));
	}




}