package main;
import java.util.*;

public class Main {
	public  String solution(String str) {
		String answer="";
		int len=0;
		int lt=0;
		int rt=str.length()-1;
		char[] s= str.toCharArray();
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(s[rt])) {
				rt--;
			}else {
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}

		}


		return String.valueOf(s);
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));



	}

}