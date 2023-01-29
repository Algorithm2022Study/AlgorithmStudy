package 다이나믹프로그래밍;
import java.util.*;
import java.io.*;

public class 퇴사 {
	public static int[] dp=new int[16];
	public static int[] t=new int[15];
	public static int[] p=new int[15];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0;i<n;i++){
			st=new StringTokenizer(br.readLine());
			t[i]=Integer.parseInt(st.nextToken());
			p[i]=Integer.parseInt(st.nextToken());
		}
		int maxValue=0;

		for(int i=n-1;i>=0;i--){
			int time=t[i]+i;
			if(time<=n){
				dp[i]=Math.max(p[i]+dp[time],maxValue);
				maxValue=dp[i];
			}
			else dp[i]=maxValue;
		}

		System.out.println(maxValue);


	}
}
