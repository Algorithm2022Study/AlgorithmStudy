package stack_queue;
import java.util.*;

public class 교육과정설계 {
	public String solution(String an, String str) {

		String answer="YES";

		Queue<Character> st = new LinkedList<>();

		for(int i=0; i<str.length();i++) {
			for(int j=0; j<an.length(); j++) {
				if(str.charAt(i)==an.charAt(j)) st.add(str.charAt(i));

			}
		}
		String q="";
		while(!st.isEmpty()) {
			q+=st.poll();
		}
		//System.out.println(q);
		if(!an.equals(q)) answer="NO";
		return answer;
	}



	public static void main(String[] args) {
		교육과정설계 T = new 교육과정설계();
		Scanner kb = new Scanner(System.in);
		String n = kb.nextLine();
		String a = kb.nextLine();

		System.out.print(T.solution(n,a));}}

