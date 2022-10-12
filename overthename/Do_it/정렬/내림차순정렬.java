package 정렬;

import java.util.Scanner;

public class 내림차순정렬 {
	public static  void main(String[] args){
		//선택정렬
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int size = st.length();
		int A[] = new int[size];

		for(int i=0; i<size;i++){
			A[i]=Integer.parseInt(st.substring(i,i+1));
		}


		for(int i=0; i<size; i++){
			int max = i;
			//1.최댓값을 찾음
			for (int j=i+1;j<size;j++){
				if(A[j]>A[max]){
					max=j;
				}
			}
			//swap
			if(A[i]<A[max]){
				int temp = A[i];
				A[i] = A[max];
				A[max] = temp;
			}

		}
		for(int i=0; i<size; i++){
		System.out.print(A[i]);}
	}
}
