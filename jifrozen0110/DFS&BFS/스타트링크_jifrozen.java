
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 스타트링크 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int F = Integer.parseInt(st.nextToken());// 총
        int S = Integer.parseInt(st.nextToken());// 현재위치
        int G = Integer.parseInt(st.nextToken());// 도착지
        int U = Integer.parseInt(st.nextToken());// 위
        int D = Integer.parseInt(st.nextToken());// 아래

        int[] map = new int[F + 1];
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(S);
        map[S] = 1;
        while (!q.isEmpty()) {
            int num = q.poll();
            if (num == G) {
                answer = map[num];
                break;
            }
            int up = num + U;
            int down = num - D;
            if (up > 0 && up <= F) {
                if (map[up] == 0) {
                    q.add(up);
                    map[up] += map[num] + 1;
                }
            }
            if (down > 0 && down <= F) {
                if (map[down] == 0) {
                    q.add(down);
                    map[down] += map[num] + 1;
                }
            }
        }
        if (answer == 0) {
            System.out.println("use the stairs");
        } else {
            System.out.println(answer - 1);
        }
    }
}
