package 다이나믹프로그래밍;

import java.util.ArrayList;
import java.util.Scanner;

public class 일이삼더하기 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		int n=sc.nextInt();
		int max=0;
		while(n-->0){
			int num=sc.nextInt();
			if(max<num) max=num;
			arr.add(num);
		}

		int[] dp=new int[max+1];
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		for(int i=4;i<=max;i++){
			dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
		}

		for(int i=0;i<arr.size();i++){
			System.out.println(dp[arr.get(i)]);
		}





	}
}
