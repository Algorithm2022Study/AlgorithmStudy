package main;
import java.util.*;



class Time implements Comparable<Time>{
	public int time;
	public char state;
	public Time(int time,char state) {
		this.time = time;
		this.state = state;
	}

	@Override
	public int compareTo(Time o) {
		if(this.time==o.time) return this.state-o.state;
		else return this.time-o.time;
	}
}

public class Main {


	public int solution(int n, ArrayList<Time> arr) {
		int answer=Integer.MIN_VALUE;

		Collections.sort(arr);
		int cnt =0;
		for(Time a: arr) {
			if(a.state=='S') cnt++;
			else cnt--;
			answer=Math.max(answer, cnt);
		}

		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		int k = kb.nextInt();

		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<k; i++) {
			int s=kb.nextInt();
			int e=kb.nextInt();
			arr.add(new Time(s,'S'));
			arr.add(new Time(e,'E'));
		}

		System.out.println(T.solution(k,arr));

	}}
	
	
	
