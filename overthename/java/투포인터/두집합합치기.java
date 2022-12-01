package main;
import java.util.*;
//abcAb
//1
//baAcc

public class Main {
	public  ArrayList<Integer> solution(int n1,int[] list1,int n2,int[] list2) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0;
		int p2=0;

		while(p1<n1&&p2<n2) {
			if(list1[p1]<list2[p2]) {
				answer.add(list1[p1++]);
			}else {
				answer.add(list2[p2++]);
			}
		}
		while(p1<n1) {
			answer.add(list1[p1++]);
		}
		while(p2<n2) {
			answer.add(list2[p2++]);
		}

		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] list1=new int[n];
		for(int i=0;i<n;i++) {
			list1[i]=kb.nextInt();
		}
		int n1 = kb.nextInt();
		int[] list2=new int[n1];
		for(int i=0;i<n1;i++) {
			list2[i]=kb.nextInt();
		}
		for(int x:T.solution(n,list1,n1,list2)) {
			System.out.print(x+" ");}

	}


}
