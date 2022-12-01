package main;
import java.util.*;
//0 1 2 3 4  n=5
public class Main {
	public String solution(String n) {

		Stack<Character> st = new Stack<Character>();
		String answer="";
		for(char a : n.toCharArray()) {

			if(a==')') {
				while(st.pop()!='(');
				//while문안이 참이면 다음반복, pop을 먼저 꺼낸다
			}else st.push(a);
		}
		for(int i=0;i<st.size();i++) {
			answer+=st.get(i).toString();
		}

		return answer;
	}



	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String n = kb.nextLine();


		System.out.print(T.solution(n));}}

