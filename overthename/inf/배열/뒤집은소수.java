package main;
import java.util.*;
//0 1 2 3 4  n=5
public class Main {
	public  ArrayList<Integer> solution(int n, int[] list) {


		ArrayList<Integer> answer = new ArrayList<Integer>();

		for(int x : list) {
			String v = String.valueOf(x);
			v = new StringBuilder(v).reverse().toString();
			int newNum = Integer.parseInt(v);
			if(newNum!=1) {
				if(isPrime(newNum)) answer.add(newNum);}
		}

		return answer;
	}

	public boolean isPrime(int n) {

		for(int i=2;i<n;i++) {
			if(n%i==0) return false;
		}

		return true;
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