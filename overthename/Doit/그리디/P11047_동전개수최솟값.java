package overthename.그리디;

import java.io.IOException;
import java.util.Scanner;

public class P11047_동전개수최솟값 {
	public static  void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int A[] = new int[N];
		for(int i=0; i<N; i++){
			A[i]=sc.nextInt();
		}
		int count=0;
		for (int i=N-1; i>=0; i--){
			if(A[i]<K){
				count += (K/A[i]);
				K= K%A[i];
			}
		}
		System.out.println(count);
	}
}
