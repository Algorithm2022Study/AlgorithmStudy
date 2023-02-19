import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] move = {{0,1},{0,-1},{1,0},{-1,0}};
        Queue<Position> que = new LinkedList();
        int[][] count = new int[maps.length][maps[0].length];

        que.add(new Position(0,0));
        count[0][0] = 1;

        while(!que.isEmpty()) {
            Position cur = que.poll();
            int curCount = count[cur.y][cur.x];
            for(int i=0;i<4;i++) {
                Position p = new Position(cur.x+move[i][0], cur.y+move[i][1]);

                if (p.x<0 || p.y<0 || p.x==maps[0].length || p.y==maps.length){
                    continue;
                }
                if (maps[p.y][p.x]==0) {
                    continue;
                }

                count[p.y][p.x] = curCount+1;
                maps[p.y][p.x] = 0;
                que.add(p);
            }
        }
        answer = count[maps.length-1][maps[0].length-1];
        if (answer == 0) {
            return -1;
        }

        return answer;
    }
}

class Position {
    int x,y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}