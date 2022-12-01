import java.util.*;

public class Main {
	public  String solution(String str) {
		String answer="";

		//ksekkset
		//01234567


		int[] re = new int[str.length()];
		char[] s= str.toCharArray();

		for(int i=0; i<s.length;i++) {
			for(int j=i; j<s.length;j++) {
				if(s[i]==s[j]) {
					re[j]+=1;

				}

			}
		}

		for(int i=0; i<s.length;i++) {
			if(re[i]==1) {
				answer+=s[i];
			}
		}


		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));

	}

}