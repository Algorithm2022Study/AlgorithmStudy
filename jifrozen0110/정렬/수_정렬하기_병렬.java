package 정렬;

import java.io.*;

public class 수_정렬하기_병렬 {
	public static int[] A, tmp;
	public static long result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		A = new int[N + 1];
		tmp = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		merget_sort(1, N); // 병합정렬 수행하기

		StringBuilder sb=new StringBuilder();
		for (int i = 1; i <= N; i++) {
			sb.append(A[i] + "\n");
		}
		System.out.println(sb);
	}

	private static void merget_sort(int s, int e) {
		if (e - s < 1)
			return;
		int m = s + (e - s) / 2;
		// 재귀함수 형태로 구현
		merget_sort(s, m);
		merget_sort(m + 1, e);
		for (int i = s; i <= e; i++) {
			tmp[i] = A[i];
		}
		int k = s;
		int index1 = s;
		int index2 = m + 1;
		while (index1 <= m && index2 <= e) { // 두 그룹을 Merge 해주는 로직
			if (tmp[index1] > tmp[index2]) {
				A[k] = tmp[index2];
				k++;
				index2++;
			} else {
				A[k] = tmp[index1];
				k++;
				index1++;
			}
		}
		// 한쪽 그룹이 모두 선택된 후 남아있는 값 정리하기
		while (index1 <= m) {
			A[k] = tmp[index1];
			k++;
			index1++;
		}
		while (index2 <= e) {
			A[k] = tmp[index2];
			k++;
			index2++;
		}

	}
}