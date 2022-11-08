package main;
import java.util.*;

public class Main {
	public  int solution(String str) {
		int answer=0;
		String s="";
		for(int i=0; i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))){
				s+=str.charAt(i);
			}
		}

		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String n = kb.next();
		System.out.print(T.solution(n));

	}

}