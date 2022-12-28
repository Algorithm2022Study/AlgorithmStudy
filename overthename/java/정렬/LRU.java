package main;
import java.util.*;


public class Main {
	public int[] solution(int n, int[] arr) {

		// i-1 과 i 를 바꾸고
		int[] nl = new int[n];

		for(int x: arr) {
			int pos=-1;
			for(int i=0; i<n; i++) if(x==nl[i]) pos=i;
			//cache miss
			if(pos==-1) {
				for(int i=n-1;i>=1;i--) {
					nl[i]=nl[i-1];
				}
			}else {//cache hit
				for(int i=pos;i>=1;i--) {
					nl[i]=nl[i-1];
				}
			}
			//들어오는 값 넣기
			nl[0]=x;

		}


		return nl;
	}



	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[k];
		for(int i=0; i<k;i++) {
			arr[i]=kb.nextInt();
		}

		for(int i :T.solution(n,arr) ) {
			System.out.print(i+" ");}}
}


