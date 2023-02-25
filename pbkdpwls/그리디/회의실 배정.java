import java.util.*;

public class meetingroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int timeTable[][] = new int[N][2];

        for (int i = 0; i < N; i++) {
            timeTable[i][0] = sc.nextInt();
            timeTable[i][1] = sc.nextInt();
        }

        // 종료시간에 따라 2차원 배열 정렬
        Arrays.sort(timeTable, (a, b) -> {
            if(a[1] == b[1]) return a[0] - b[0]; // 종료시간이 같은 경우 시작시간이 빠른 순으로 비교
            return a[1] - b[1];
        });

        int ans = 0;
        int time = 0;

        for (int i = 0; i < N; i++) {
            // 다음회의시작시각 >= 이전회의종료시각
            if (timeTable[i][0] >= time) {
                time = timeTable[i][1];
                ans++;
            }
        }

        System.out.println(ans);
    }
}