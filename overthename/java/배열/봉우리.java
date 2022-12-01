package main;
import java.util.*;
//0 1 2 3 4  n=5
public class Main {
	public  int solution(int n, int[][] list) {


		int answer=0;
		int[][] nl = new int[n+2][n+2];
		for(int i=0;i<n+2;i++) {
			nl[0][i]=0;
			nl[i][0]=0;
			nl[n+1][i]=0;
			nl[i][n+1]=0;
		}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<n+1;j++) {
				nl[i][j]=list[i-1][j-1];
			}
		}
	/*
	for(int i=0;i<n+2;i++) {
		for(int j=0;j<n+2;j++) {
			System.out.print(nl[i][j]+" ");
		}
		System.out.println();
	}*/

		for(int i=1;i<n+1;i++) {
			for(int j=1;j<n+1;j++) {
				if((nl[i-1][j]<nl[i][j])&&(nl[i][j+1]<nl[i][j])&&(nl[i][j-1]<nl[i][j])&&(nl[i+1][j]<nl[i][j])) {
					//System.out.print("위쪽"+nl[i-1][j]+" 오른쪽"+nl[i][j+1]+" 아래쪽"+nl[i+1][j]+" 왼쪽"+nl[i][j-1]);
					//System.out.println(" "+nl[i][j]+" ");
					answer++;
				}
			}
		}
		return answer;
	}



	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] list = new int[n][n];
		for(int j=0;j<n;j++) {
			for(int i=0;i<n;i++) {
				list[j][i]=kb.nextInt();
			}}

		System.out.print(T.solution(n,list));
	}




}