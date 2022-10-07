package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.w3c.dom.Node;

public class 카드 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int n= sc.nextInt();

		//큐에 카드 저장
		for(int i=1; i<=n;i++){
			q.add(i);
		}

		while(q.size() >1){
			q.poll(); //맨 위에 카드 제거
			q.add(q.poll()); //제거된 카드 추가
		}

		System.out.println(q.poll());


	}
}
