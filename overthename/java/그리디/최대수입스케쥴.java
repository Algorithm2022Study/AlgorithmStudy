package 그리디;
import java.util.*;



class Lecture implements Comparable< Lecture>{
	public int time;
	public int money;
	public  Lecture(int money,int time) {
		this.time = time;
		this.money = money;
	}

	@Override
	public int compareTo( Lecture o) {
		return  o.time-this.time; //내림차순
	}
}

public class 최대수입스케쥴 {

	static int n,max=Integer.MIN_VALUE;
	public int solution( ArrayList<Lecture> arr) {
		int answer=0;

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		//기본값은 작은 것을 우선순위로 함 collections.reverseorder()해야 큰값이 우선순위
		Collections.sort(arr);
		int j=0;
		for(int i=max; i>=1; i--) {
			for(; j<n; j++) {
				if(arr.get(j).time<i) break;
				pq.offer(arr.get(j).money);
			}
			if(!pq.isEmpty()) answer+=pq.poll();
		}

		return answer;
	}

	public static void main(String[] args) {
		최대수입스케쥴 T = new 최대수입스케쥴();
		Scanner kb = new Scanner(System.in);

		n= kb.nextInt();

		ArrayList<Lecture> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int s=kb.nextInt();
			int e=kb.nextInt();
			arr.add(new Lecture(s,e));
			if(e>max) max=e;

		}

		System.out.println(T.solution(arr));

	}}



