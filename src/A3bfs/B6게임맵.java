package A3bfs;

import java.util.LinkedList;
import java.util.Queue;

public class B6게임맵 {
    public static void main(String[] args) {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0,0});
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        while (!queue.isEmpty()){
            int[] current = queue.poll();
            for(int i=0;i<4;i++){
                int nx = current[0]+dx[i];
                int ny = current[1]+dx[i];
                if(nx>=0 && nx<maps.length && ny>=0 && ny<maps[0].length){
                    if(maps[nx][ny] == 1){
//                        queue.add(new int[]{nx,ny,current[2]+1});lk
                    }
                }
            }
        }

    }
}
