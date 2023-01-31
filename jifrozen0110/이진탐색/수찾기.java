package 이진탐색;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기 {
	public static int bs(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target)
				return 1;
			else if (arr[mid] > target)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return 0;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < m; i++) {
			System.out.println(bs(arr, Integer.parseInt(st.nextToken()), 0, n - 1));
		}

	}
}
