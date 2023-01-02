package 동적계획법;
import java.util.*;


public class 계단오르기 {

	static int[] dy;
	public int solution(int n) {
		int answer=0;

		dy[1]=1;
		dy[2]=2;
		for(int i=3; i<=n; i++) {
			dy[i]=dy[i-2]+dy[i-1];
		}


		return dy[n];
	}

	public static void main(String[] args) {
		계단오르기 T = new 계단오르기();
		Scanner kb = new Scanner(System.in);

		int k = kb.nextInt();
		dy= new int[k+1];

		System.out.println(T.solution(k));

	}}



