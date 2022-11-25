package main;
import java.util.*;
//0 1 2 3 4  n=5
public class Main {
	public  int[] solution(int n, int[] list) {


		int[] s = new int[n];


		for(int i=0; i<n;i++) {
			int cnt=1;
			for(int j=0; j<n;j++) {
				if(list[j]>list[i]) {
					cnt++;
				}
			}
			s[i]=cnt;
		}


		return s;
	}



	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] list = new int[n];
		for(int i=0;i<n;i++) {
			list[i]=kb.nextInt();
		}
		for(int s :T.solution(n,list)) {
			System.out.print(s+" ");
		}


	}

}