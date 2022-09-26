package 정렬;

import java.util.Scanner;

public class 소트인사이드 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		String str=sc.nextLine();

		StringBuilder sb=new StringBuilder();

		int n=str.length();

		int[] A=new int[n];

		for(int i=0;i<n;i++){
			A[i]=str.charAt(i)-'0';
		}
		int max=0;
		for(int i=0;i<n;i++){
			max=i;
			for(int j=i+1;j<n;j++) {
				if (A[max]<A[j]){
					max=j;
				}
			}
			int tmp=A[i];
			A[i]=A[max];
			A[max]=tmp;
		}

	for(int i=0;i<n;i++){
		System.out.print(A[i]);
	}
	}
}
