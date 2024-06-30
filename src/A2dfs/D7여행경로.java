package A2dfs;

import java.util.*;

public class D7여행경로 {
    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"},{"ATL","SFO"}};
        System.out.println(Arrays.toString(solution(tickets)));
    }

    public static String[] solution(String[][] tickets) {
        Map<String, PriorityQueue<String>> plane = new HashMap<>();
        List<String> result = new ArrayList<>();
        Stack<String> s = new Stack<>();

        for (String[] t : tickets) {
            plane.computeIfAbsent(t[0], a -> new PriorityQueue<>()).add(t[1]);
        }

        s.push("ICN");
        while (!s.isEmpty()) {
            String top = s.peek();
            if (plane.containsKey(top) && !plane.get(top).isEmpty()) {
                s.push(plane.get(top).poll());
            } else {
                result.add(0, s.pop());
            }
        }
        return result.toArray(new String[0]);
    }
}