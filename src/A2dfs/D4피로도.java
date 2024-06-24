package A2dfs;

public class D4피로도 {
    public static void main(String[] args) {

    }
}


class Solution {
    private int maxDungeons;

    public int solution(int k, int[][] dungeons) {
        maxDungeons = 0;
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited, 0);
        return maxDungeons;
    }

    private void dfs(int k, int[][] dungeons, boolean[] visited, int count) {
        maxDungeons = Math.max(maxDungeons, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {  // 방문하지 않았고 최소 필요 피로도 이상인 경우
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, visited, count + 1);  // 소모 피로도만큼 피로도 감소
                visited[i] = false;
            }
        }
    }
}
