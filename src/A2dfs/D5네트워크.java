package A2dfs;

import java.util.LinkedList;
import java.util.Queue;

public class D5네트워크 {
    public static void main(String[] args) {
        D5네트워크 solution = new D5네트워크();
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        System.out.println(solution.solution(n, computers));
    }

    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n]; // 각 컴퓨터의 방문 여부를 저장하는 배열
        int cnt = 0; // 네트워크의 수를 저장하는 변수
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, visited, i);
                cnt++;
            }
        }
        return cnt; // 최종 네트워크의 수 반환
    }

    public void dfs(int[][] computers, boolean[] visited, int start) {
        visited[start] = true; // 현재 컴퓨터를 방문 표시
        for (int i = 0; i < computers.length; i++) {
            // 현재 컴퓨터와 연결되어 있고, 아직 방문하지 않은 컴퓨터를 재귀적으로 방문
            if (computers[start][i] == 1 && !visited[i]) {
                dfs(computers, visited, i);
            }
        }
    }
}
