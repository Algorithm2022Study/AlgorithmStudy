package main;
import java.util.*;

public class Main {
	public  String solution(String str) {
		String answer="";

		//gooG
		//0123
		str=str.toLowerCase();
		//System.out.print(str);
		String a1 = new StringBuilder(str).reverse().toString();
		//System.out.print(a1);
		if(a1.equals(str)) {return "YES";}
		else return "NO";


	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));

	}

}