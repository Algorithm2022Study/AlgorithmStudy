package main;
import java.util.*;
//0 1 2 3 4  n=5
public class Main {
	public  ArrayList<Integer> solution(int n, int[] list) {
		//int[] answer=new int[n];
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(list[0]);
		for(int i=1;i<n-1;i++) {
			if(list[i]<list[i+1]) {
				answer.add(list[i+1]);
			}
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
		for(int s :T.solution(n,list)) {
			System.out.print(s+" ");
		}


	}

}