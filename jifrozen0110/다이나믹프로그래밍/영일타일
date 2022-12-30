package 다이나믹프로그래밍;

import java.util.Scanner;

public class 영일타일 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int[] d=new int[1000001];
		d[1]=1;
		d[2]=2;

		for(int i=3;i<=N;i++){
			d[i]=(d[i-1]+d[i-2])%15746;
		}

		System.out.println(d[N]);


	}
}
