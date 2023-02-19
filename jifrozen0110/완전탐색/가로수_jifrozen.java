package 6주차.0208;

import java.util.Scanner;

public class Main {
    private static int[] gaps;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] trees = new int[N];
        gaps = new int[N - 1];

        for (int i = 0; i < N; i++) {
            trees[i] = scanner.nextInt();

            if (i > 0) {
                gaps[i - 1] = trees[i] - trees[i - 1];
            }
        }

        for (int i = 0; i <= gaps.length - 2; i++) {
            gaps[i + 1] = gcd(gaps[i], gaps[i + 1]);
        }

        int gap = gaps[gaps.length - 1];

        System.out.println((trees[N - 1] - trees[0]) / gap - (N - 1));
    }

    private static int gcd(int a, int b) {
        while (b > 0)
        {
            int tmp = a;

            a = b;
            b = tmp%b;
        }
        return a;
    }
}