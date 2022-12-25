package stack_queue;
import java.util.*;


class Person{
	int id;
	int priority;

	public  Person(int id,int priority) {
		this.id=id;
		this.priority=priority;
	}

}
//
public class 응급실 {
	public int solution(int[] list, int k) {

		int answer=0;

		Queue<Person> q = new LinkedList<>();

		for(int i=0;i<list.length;i++) {
			q.offer(new Person(i,list[i]));
		}

		while(!q.isEmpty()) {
			Person tmp = q.poll();
			for(Person a : q) {
				if(a.priority>tmp.priority) {
					q.offer(tmp);  tmp=null; break;
				}

			}
			if(tmp!=null) {
				answer++;
				if(tmp.id==k) return answer;
			}

		}

		return answer;
	}



	public static void main(String[] args) {
		응급실 T = new 응급실();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int a = kb.nextInt();
		int[] list = new int[n];
		for(int i=0;i<n;i++) {
			list[i]=kb.nextInt();
		}

		System.out.print(T.solution(list,a));}}

