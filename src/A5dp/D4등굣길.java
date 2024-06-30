package A5dp;

public class D4등굣길 {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int m, int n, int[][] puddles) {
            int[][] dp = new int[n + 1][m + 1];

            // 웅덩이 위치 표시
            for (int[] puddle : puddles) {
                dp[puddle[1]][puddle[0]] = -1; // 웅덩이를 -1로 표시
            }

            dp[1][1] = 1;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (dp[i][j] == -1) { // 웅덩이
                        dp[i][j] = 0;
                    } else {
                    }
                }
            }

            return dp[n][m];
        }
    }
}
