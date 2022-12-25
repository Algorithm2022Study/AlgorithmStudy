package main;
import java.util.*;


public class Main {
	public int[] solution(int n, int[] arr) {


		for(int j=0; j<n;j++) {
			for(int i=0; i<n-1-j; i++) {
				if(arr[i]>arr[i+1]) {
					int tmp= arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tmp;
				}
			}
		}

		return arr;
	}



	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i]=kb.nextInt();
		}

		for(int i :T.solution(n,arr) ) {
			System.out.print(i+" ");}}
}


