package overthename.그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1916_최소비용구하기 {
	public static int n,m;
	public static int distance[];
	public static ArrayList<Node> list[];
	static boolean visited[];
	static PriorityQueue<Node> pq = new PriorityQueue<Node>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(br.readLine());

		distance = new int[n + 1];
		visited = new boolean[n + 1];
		list = new ArrayList[n + 1];

		for (int i = 1; i <= n; i++) {
			list[i] = new ArrayList<Node>();
		}
		for (int i = 0; i <= n; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			list[u].add(new Node(v, w));
		}

		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		System.out.println(dijkstra(start,end));

	}

	public static int dijkstra(int start,int end){
		pq.add(new Node(start,0));
		distance[start] = 0;
		while (!pq.isEmpty()) {
			Node current = pq.poll();
			int cv = current.vertex;
			if (visited[cv])
				continue;
			visited[cv] = true;
			for (int i = 0; i < list[cv].size(); i++) {
				Node temp = list[cv].get(i);
				int nv = temp.vertex;
				int value = temp.value;
				if (distance[nv] > distance[cv] + value) {
					distance[nv] = distance[cv] + value;
					pq.add(new Node(nv, distance[nv]));
				}
			}
		}
		return distance[end];
	}

}

class Node implements Comparable<Node>{
	int vertex, value;
	Node(int vertex, int value){
		this.vertex = vertex;
		this.value = value;
	}

	public int compareTo(Node e){
		return value - e.value;
	}
}