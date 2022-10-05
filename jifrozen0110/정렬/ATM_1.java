package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ATM_1 {
	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		int[] A=new int[n];

		for(int i=0;i<n;i++){
			A[i]=Integer.parseInt(st.nextToken());
		}

		for(int i=1;i<n;i++){
			for(int j=i;j>0;j--){
				if(A[j]<A[j-1]){
					int temp=A[j];
					A[j]=A[j-1];
					A[j-1]=temp;
				}else break;
			}
		}

		int answer=0;
		int sum=0;

		for(int i=0;i<n;i++){
			answer+=A[i]+sum;
			sum+=A[i];
		}

		System.out.println(answer);

	}
}
