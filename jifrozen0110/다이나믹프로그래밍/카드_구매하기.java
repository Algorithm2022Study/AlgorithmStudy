package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 카드_구매하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N=Integer.parseInt(br.readLine());

		StringTokenizer st=new StringTokenizer(br.readLine());
		int[] cards=new int[N+1];
		int[] d=new int[N+1];
		for(int i=1;i<=N;i++){
			cards[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++){
				d[i]=Math.max(d[i],cards[j]+d[i-j]);
			}
		}
		System.out.println(d[N]);
	}
}
