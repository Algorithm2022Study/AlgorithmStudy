package main;
import java.util.*;

public class Main {
	public String solution(String str) {
		String answer="";

		//대문자는 65~90 소문자 97~122 둘의 차이는 32
		/*for(char c : str.toCharArray()) {
			if(Character.isLowerCase(c)) answer+= Character.toUpperCase(c);
			else answer+= Character.toLowerCase(c);
		}*/

		for(char c : str.toCharArray()) {
			if(c>=97&&c<=122) answer+= (char)(c-32);
			else answer+= (char)(c+32);
		}

		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));

	}

}
