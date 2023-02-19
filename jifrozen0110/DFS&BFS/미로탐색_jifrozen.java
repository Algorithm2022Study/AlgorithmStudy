
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색 {
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { -1, 0, 1, 0 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        Queue<Node> pq = new LinkedList<>();
        pq.offer(new Node(0, 0));

        while (!pq.isEmpty()) {
            Node n = pq.poll();
            for (int i = 0; i < 4; i++) {
                int nx = n.X + dx[i];
                int ny = n.Y + dy[i];
                if (nx <= -1 || ny <= -1 || nx >= N || ny >= M)
                    continue;
                if (map[nx][ny] == 1) {
                    map[nx][ny] += map[n.X][n.Y];
                    pq.offer(new Node(nx, ny));
                }
            }

        }
        System.out.println(map[N - 1][M - 1]);
    }

    static class Node {
        private int X;
        private int Y;

        public Node(int X, int Y) {
            this.X = X;
            this.Y = Y;
        }
    }
}
