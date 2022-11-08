package main;
import java.util.*;

public class Main {
	public  String[] solution(String[] str) {
		String[] answer=new String[str.length];
		int len=0;
		ArrayList<String> m = new ArrayList<>();
		for(String s: str) {
			//String tmp=new StringBuilder(s).reverse().toString();
			//answer[len++]=tmp;
			answer[len++]=new StringBuilder(s).reverse().toString();
		}
		//ArrayList<String>

		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int len = kb.nextInt();
		String[] str = new String[len];
		for(int i=0;i<len;i++) {
			str[i]=kb.next();
		}
		for(String s :T.solution(str)) {
			System.out.println(s);
		}


	}

}

public class Main {
	public  String[] solution(String[] str) {
		String[] answer=new String[str.length];
		int len=0;
		ArrayList<String> m = new ArrayList<>();


		for(String s: str) {
			char[] a = s.toCharArray();
			int lt=0;
			int rt=s.length()-1;
			while(lt<rt) {
				char tmp = a[lt];
				a[lt]=a[rt];
				a[rt]=tmp;
				lt++;
				rt--;
			}
			answer[len++]=String.valueOf(a);

		}

		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int len = kb.nextInt();
		String[] str = new String[len];
		for(int i=0;i<len;i++) {
			str[i]=kb.next();
		}
		for(String s :T.solution(str)) {
			System.out.println(s);
		}


	}

}