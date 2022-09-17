package Two_pointer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 주몽 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
		int N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());

		StringTokenizer st=new StringTokenizer(br.readLine());

		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=Integer.parseInt(st.nextToken());
		}

		Arrays.sort(A);

		int start=0;
		int end=N-1;

		int answer=0;

		while(start<end){
			if(A[start]+A[end]<M){
				start++;
			}else if(A[start]+A[end]>M){
				end--;
			}else{
				answer++;
				start++;
			}
		}

		System.out.println(answer);

	}
}
