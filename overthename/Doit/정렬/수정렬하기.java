package 정렬;

import java.util.Scanner;

public class 수정렬하기 {
	public static  void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i=0; i<n;i++){
			A[i]=sc.nextInt();
		}
		for(int i=0; i<n-1; i++){
			for (int j=0;j<n-1-i;j++){
				if(A[j]>A[j+1]){
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
			}
		}
		for(int i=0; i<n; i++){
		System.out.println(A[i]);}
	}
}
