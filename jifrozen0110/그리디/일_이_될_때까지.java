package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 일_이_될_때까지 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		int answer=0;
		while(n>=k){
			while(n%k!=0){
				n-=1;
				answer+=1;
			}
			n=n/k;
			answer+=1;
		}

		while (n>1){
			n-=1;
			answer+=1;
		}

		System.out.println("answer = " + answer);
	}
	
}
