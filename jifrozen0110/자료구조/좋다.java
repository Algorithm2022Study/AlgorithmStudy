package Two_pointer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class 좋다 {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		long[] A = new long[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}

		Arrays.sort(A);


		int answer = 0;


		for(int j=0;j<N;j++) {
			int start = 0;
			int end = N-1;
			while (start<end) {
				if (A[start] + A[end] == A[j]) {
					if(start!=j&&end!=j) {
						answer++;
						break;
					}else if(start==j){
						start++;
					}else if(end==j){
						end--;
					}
				} else if (A[start] + A[end] < A[j]) {
					start++;
				} else {
					end--;
				}
			}
		}
		System.out.println(answer);
		br.close();
	}
}

