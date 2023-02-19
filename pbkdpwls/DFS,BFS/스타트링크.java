import java.util.*;
public class Main {
    static int n; // 건물 층수
    static int g; // 현재 있는 곳
    static int now; // 목표 위치
    static int up;
    static int down;
    static int[] visited;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        g = scanner.nextInt();
        now = scanner.nextInt();
        up = scanner.nextInt();
        down = scanner.nextInt();

        visited = new int[n+1];
        bfs();
    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(g);
        visited[g]=1;

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            if(temp==now) {
                System.out.println(visited[temp]-1);
                break;
            }
            if(temp+up <= n && visited[temp+up]==0) {
                visited[temp+up] = visited[temp] + 1;
                queue.add(temp+up);
            }
            if(temp-down>0 && visited[temp-down]==0) {
                visited[temp-down] = visited[temp] + 1;
                queue.add(temp-down);
            }
        }

        if(visited[now] == 0) {
            System.out.println("use the stairs");
        }

    }
}