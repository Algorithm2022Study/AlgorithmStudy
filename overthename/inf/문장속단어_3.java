package main;
import java.util.*;

public class Main {
	public String solution(String str) {
		String answer="";
		int len=0;
		String[] list1 = str.split(" ");
		for(String s:list1) {
			if(len<s.length()) {
				len=s.length();
				answer=s;

			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); //문자열이 next이고 문장은 nextLine
		System.out.print(T.solution(str));

	}

}