package DFS_BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 부등호 {
	static char[] strs;
	static boolean[] visited=new boolean[10];
	static ArrayList<String> arr=new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		strs=new char[k];
		for(int i=0;i<k;i++){
			strs[i]=sc.next().charAt(0);
		}
		DFS(0, k, "");
		Collections.sort(arr);

		System.out.println(arr.get(arr.size()-1));
		System.out.println(arr.get(0));

	}
	public static void DFS(int cnt,int k,String str){
		if(cnt==k+1){
			arr.add(str);
			return;
		}
		for(int i=0;i<10;i++){
			if(cnt==0||!visited[i]&&compare(str.charAt(str.length()-1)-'0',i,strs[cnt-1])){
				visited[i]=true;
				DFS(cnt+1,k,str+i);
				visited[i]=false;
			}
		}
	}

	public static boolean compare(int a,int b,char str){
		if(str=='<') return a<b;
		else return a>b;
	}
}
