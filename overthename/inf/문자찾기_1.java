package main;
import java.util.*;

public class Main {
	public int solution(String str, char t) {
		int answer=0;
		//대문자와 소문자를 구별하지 않으니 대문자로 바꾸기
		str=str.toUpperCase();
		t=Character.toUpperCase(t);

		/*for(int i=0;i<str.length();i++) {
			if(t==str.charAt(i)) {
				answer++;
			}
		}*/

		for(char a: str.toCharArray()) {
			if(a==t) answer++;
		}


		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); //next는 문자열 읽어드림
		char c = kb.next().charAt(0); //0번에 있는 문자열을 가져와라, char변수를 가져올 수 있음
		System.out.print(T.solution(str, c));

	}

}
