package 자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간_합_구하기_4 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());

		st=new StringTokenizer(br.readLine());
		int sum=0;
		int[] S=new int[N+1];
		for(int i=1;i<=N;i++){
			sum+=Integer.parseInt(st.nextToken());
			S[i]=sum;
		}

		StringBuilder sb=new StringBuilder();

		for(int i=0;i<M;i++){
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			sb.append(S[b]-S[a-1]);
			sb.append("\n");
		}

		System.out.print(sb.toString());

	}
}
