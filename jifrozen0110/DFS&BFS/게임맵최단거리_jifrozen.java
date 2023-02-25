import java.util.*;

class Solution {
    static int[] dx = { 0, 1, 0, -1 };
    static int[] dy = { -1, 0, 1, 0 };
    static int[][] visited;
    static int[][] map;

    class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int solution(int[][] maps) {
        int answer = 0;
        visited = new int[maps.length][maps[0].length];
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0, 0));
        visited[0][0] = 1;
        while (!q.isEmpty()) {
            Node node = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= maps.length || ny >= maps[0].length || maps[nx][ny] == 0) {
                    continue;
                }
                if (visited[nx][ny] == 0) {
                    visited[nx][ny] += visited[node.x][node.y] + 1;
                    q.offer(new Node(nx, ny));
                }
            }

        }
        if (visited[maps.length - 1][maps[0].length - 1] == 0) {
            return -1;
        } else {
            return visited[maps.length - 1][maps[0].length - 1];
        }

    }
}