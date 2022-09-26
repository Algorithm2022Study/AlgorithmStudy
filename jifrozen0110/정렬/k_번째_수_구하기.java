package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class k_번째_수_구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());

		st=new StringTokenizer(br.readLine());
		int A[]=new int[N];

		for(int i=0;i<N;i++){
			A[i]=Integer.parseInt(st.nextToken());
		}

		Arrays.sort(A);

		System.out.println(A[K-1]);
	}
}
