package 정렬;
import java.util.*;


public class 선택정렬 {
	public int[] solution(int n, int[] arr) {


		for(int j=0; j<n-1;j++) {
			int idx=j;
			for(int i=j+1; i<n; i++) {
				if(arr[i]<arr[idx]) {
					idx=i;
				}
				int tmp = arr[j];
				arr[j]=arr[idx];
				arr[idx]=tmp;

			}
		}

		return arr;
	}



	public static void main(String[] args) {
		선택정렬 T = new 선택정렬();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i]=kb.nextInt();
		}

		for(int i :T.solution(n,arr) ) {
			System.out.print(i+" ");}}
}


