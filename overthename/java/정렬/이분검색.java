package 정렬;
import java.util.*;


public class 중복확인 {
	public String solution(int n,int[] arr) {

		String answer="U";

		Arrays.sort(arr);

		/* 시간초과
		for(int i=0;i<n; i++) {
			for(int j=i+1; j<n;j++) {
				if(arr[i]==arr[j]) answer="D";
			}
		}*/

		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[i+1]) answer="D";
		}

		return answer;
	}



	public static void main(String[] args) {
		중복확인 T = new 중복확인();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i]=kb.nextInt();
		}


		System.out.print(T.solution(n, arr));}}


