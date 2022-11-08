package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.w3c.dom.Node;

public class 평균 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		double[] nl = new double[n];
		double sum =0;
		double max=0;

		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n;i++){
			nl[i] = Integer.parseInt(st.nextToken());
			sum+=nl[i];
			max=Math.max(nl[i],max);
		}

		System.out.println(sum/max*100/n);

	}
}
