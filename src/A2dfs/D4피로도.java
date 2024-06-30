package A2dfs;

public class D4피로도 {
    static boolean[] visited;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        visited = new boolean[dungeons.length];
        int k = 80;
        dfs(dungeons, k, 0);
        System.out.println("최대 탐험 가능한 던전 수: " + max);
    }

    static void dfs(int[][] dungeons, int k, int count) {
        if (count > max) {
            max = count;
        }
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(dungeons, k - dungeons[i][1], count + 1);
                visited[i] = false; // 백트래킹
            }
        }
    }
}
