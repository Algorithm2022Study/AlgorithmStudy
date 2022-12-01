package main;
import java.util.*;
//0 1 2 3 4  n=5
public class Main {
	public  int solution(int n, int[] list) {

		int answer=1;
		boolean flag=false;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(list[j]>=list[i]) {
					flag=false;
					break;
				}else {
					flag=true;
				}
			}
			if(flag) {
				System.out.print(list[i]+" ");
				answer++;}

		}


		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] list = new int[n];
		for(int i=0;i<n;i++) {
			list[i]=kb.nextInt();
		}
		System.out.print(T.solution(n,list));


	}

}