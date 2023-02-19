import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[][] maps;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maps = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0;i<n;i++){
            String s = bf.readLine();
            for(int j=0;j<m;j++){
                maps[i][j] = s.charAt(j) - '0';
            }
        }

        visited[0][0] = true;
        bfs(0,0);
        System.out.println(maps[n-1][m-1]);
    }

    public static void bfs(int a, int b) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {a,b});

        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            int x = temp[0];
            int y = temp[1];

            for(int i=0;i<4;i++) {
                int x2 = x+dx[i];
                int y2 = y+dy[i];

                if (x2<0 || y2<0 || x2>=n || y2>=m) {
                    continue;
                }

                if(visited[x2][y2] || maps[x2][y2]==0){
                    continue;
                }

                queue.add(new int[] {x2,y2});
                maps[x2][y2] = maps[x][y] + 1;
                visited[x2][y2] = true;
            }
        }

    }
}