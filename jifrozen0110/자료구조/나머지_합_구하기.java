package 자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나머지_합_구하기 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());

		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());

		st=new StringTokenizer(br.readLine());

		long[] A=new long[N];
		long[] C=new long[M];
		long answer=0;

		A[0]=Integer.parseInt(st.nextToken());

		for(int i=1;i<N;i++){
			A[i]=Integer.parseInt(st.nextToken())+A[i-1];
		}
		
		for(int i=0;i<N;i++){
			int r=(int)(A[i]%M);
			if(r==0){
				answer++;
			}
			C[r]++;
		}

		for(int i=0;i<M;i++){
			if(C[i]>1) {
				answer = answer + (C[i] * (C[i] - 1) / 2);
			}
		}

		System.out.println(answer);


	}
}
