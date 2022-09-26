package 정렬;

import java.io.*;
import java.util.*;

public class 버블소트 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N=Integer.parseInt(br.readLine());
		mData[] A=new mData[N];

		for(int i=0;i<N;i++){
			int a=Integer.parseInt(br.readLine());
			A[i]=new mData(a,i);
		}

		Arrays.sort(A);
		int max=0;
		for(int i=0;i<N;i++){
			max=Math.max(max,A[i].index-i);
		}

		System.out.println(max+1);

	}
}
class mData implements Comparable<mData> {
	int value;
	int index;

	public mData(int value, int index) {
		super();
		this.value = value;
		this.index = index;
	}

	@Override
	public int compareTo(mData o) {
		return this.value - o.value;
	}
}