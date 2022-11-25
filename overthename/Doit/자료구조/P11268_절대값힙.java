package overthename.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class P11268_절대값힙 {
	public static  void main(String[] args) throws IOException {
	//우선순위 큐 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		//찾아보기
		PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)-> {
		int first_abs = Math.abs(o1);
		int second_abs = Math.abs(o2);
		if(first_abs == second_abs)
			return o1 > o2? 1:-1;
		else
			return first_abs - second_abs;

		});

		for(int i=0; i<N;i++){
			int request = Integer.parseInt(br.readLine());
			if(request ==0){
				if (queue.isEmpty())
					System.out.println("0");
				else
					System.out.println(queue.poll());
			}else{
				queue.add(request);
			}
		}

	}
}
