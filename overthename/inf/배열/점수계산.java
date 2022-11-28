package main;
import java.util.*;
//1번 문제가 맞는 경우 1 답이 맞는 처음 문제 1 틀리면 0점 연속 k

public class Main {
	public  int solution(int n, int[] list) {


		int answer = 0;

		if(list[0]==1)answer++;

		int q=2;
		for(int i=1; i<n;i++) {
			if(list[i]==1) {
				if(list[i-1]==1) {
					answer+=(q++);
				}else {
					answer++;
					q=2;
				}

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

		System.out.print(T.solution(n,list));



	}

}