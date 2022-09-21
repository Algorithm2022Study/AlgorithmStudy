package 자료구조;

import java.util.Scanner;

public class 숫자의합 {
	public static  void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nl = sc.next();
		char[] cl = nl.toCharArray();
		int sum=0;
		for(int i=0; i<n; i++){
			sum += cl[i]-'0';
		}
		System.out.println(sum);
	}
}
