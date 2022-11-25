package overthename.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P10986_나머지합 {
 public static  void main(String[] args) throws IOException {

	 	Scanner sc = new Scanner(System.in);
	 	int N = sc.nextInt();
	 	int M = sc.nextInt();
	 	long[] S = new long[N];
	 	long[] C = new long[M];
	 	long answer =0;
	 	for (int i=1; i<N; i++){
	 		S[i] = S[i-1] +sc.nextInt();
		}

	 	//합 배열의 모든 값에 %연산
	 	for(int i=0; i<N; i++){
	 		int remainder = (int) (S[i]%M);
	 		//0~i 까지의 구간 합
			if (remainder ==0) answer++;
			//나머지가 같은 인덱스 개수 세기
			C[remainder]++;
		}

	 	//나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 구해서 answer에 더하기
	 	for (int i=0; i<M; i++){
	 		if( C[i] >1 ){
	 			answer = answer+ (C[i]*(C[i]-1)/2);
			}
	 	}
	 	System.out.println(answer);

 }
}
