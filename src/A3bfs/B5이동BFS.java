package A3bfs;

import java.util.*;

public class B5이동BFS {
    public static void main(String[] args) {
        int start = 5;
        int target = 17;
        List<Integer> path = bfs(start, target);
        System.out.println("최단 경로: " + path);
        System.out.println("최단 횟수: " + (path.size() - 1));
    }

    public static List<Integer> bfs(int start, int target) {
        if (start == target) return Arrays.asList(start);

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[100001]; // 방문 여부를 저장하는 boolean 배열
        int[] previous = new int[100001]; // 각 노드의 이전 노드를 저장하는 배열
        Arrays.fill(previous, -1); // 초기 값을 -1로 설정

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            // 가능한 모든 변환 실행
            int[] nextNumbers = {temp - 1, temp + 1, temp * 2};
            for (int next : nextNumbers) {
                // 타겟에 도달하면 경로를 역추적하여 반환
                if (next == target) {
                    List<Integer> path = new ArrayList<>();
                    path.add(target);
                    int node = temp;
                    while (node != -1) {
                        path.add(node);
                        node = previous[node];
                    }
                    Collections.reverse(path);
                    return path;
                }
                // 범위 체크 및 방문하지 않은 숫자만 큐에 추가
                if (next >= 0 && next <= 100000 && !visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                    previous[next] = temp; // 이전 노드 기록
                }
            }
        }
        return Collections.emptyList(); // 타겟에 도달할 수 없는 경우
    }
}

