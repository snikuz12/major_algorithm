package A4greedy;

import java.util.Arrays;

public class G3구명보트 {
    public static void main(String[] args) {
        int[] kg = {70, 50, 80, 50};
        int limit = 100;
        int count = 0;

        Arrays.sort(kg); // 몸무게를 오름차순으로 정렬
                         // 50 50 70 80

        int i = 0; // 가장 가벼운 사람의 인덱스
        int j = kg.length - 1; // 가장 무거운 사람의 인덱스

        while (i <= j) {
            if (kg[i] + kg[j] <= limit) {
                // 두 사람의 몸무게 합이 제한 이하면 두 사람을 함께 태움
                i++; // 다음 가벼운 사람
            }
            // 무거운 사람은 항상 태움
            j--;
            count++;
        }

        System.out.println(count);
    }
}
