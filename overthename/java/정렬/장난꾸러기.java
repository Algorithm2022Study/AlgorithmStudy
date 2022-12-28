package 정렬;
import java.util.*;


public class 장난꾸러기 {
	public ArrayList<Integer> solution(int n, int[] arr) {

		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp=arr.clone(); //배열 복사

		Arrays.sort(tmp);
		for(int i=0; i<n;i++) {

			if(arr[i]!=tmp[i]) answer.add(i+1);
		}


		/*
		for(int i=0; i<n-1;i++) {
			if(arr[i]>arr[i+1]) answer[1]=i+2;

		}

		for(int i=n-1; i>=1;i--) {

			if(arr[i-1]> arr[i]) answer[0]=i;
		}*/


		return answer;
	}



	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		int k = kb.nextInt();
		int[] arr = new int[k];
		for(int i=0; i<k;i++) {
			arr[i]=kb.nextInt();
		}

		for(int i :T.solution(k,arr) ) {
			System.out.print(i+" ");}}
}


