package 그래프;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class P1753_최단경로 {

	public static int V,E,K;
	public static int distance[];
	public static boolean visited[];
	public static ArrayList<Edge> list[];
	public static PriorityQueue<Edge> q = new PriorityQueue<Edge>();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		distance = new int[V+1];
		visited = new boolean[V+1];
		list = new ArrayList[V+1];
		for(int i=1; i<=V; i++) {
			list[i]= new ArrayList<Edge>();

		}
		for(int i=0; i<=V; i++) {
			distance[i]= Integer.MAX_VALUE;

		}
		for(int i=0; i<E; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			list[a].add(new Edge(b,w));
		}

		q.add(new Edge(K,0));
		distance[K]=0;

		while( !q.isEmpty()) {
			Edge current = q.poll();
			int vertex = current.vertex;
			if(visited[vertex]) continue;
			visited[vertex] = true;
			for(int i=0; i<list[vertex].size(); i++){
				Edge temp = list[vertex].get(i);
				int next = temp.vertex;
				int value = temp.value;
				if(distance[next]>distance[vertex]+value) {
					distance[next]= value+distance[vertex];
					q.add(new Edge(next,distance[next]));
				}

			}

		}

		for(int i=1; i<=V; i++ ) {
			if(visited[i]) {
				System.out.println(distance[i]);
			}else
			{
				System.out.println("INF");
			}
		}

	}



}

class Edge implements Comparable<Edge>{

	int vertex, value;
	Edge(int vertex, int value){
		this.vertex=vertex;
		this.value=value;
	}
	@Override
	public int compareTo(Edge o) {
		return value - o.value;
	}



}