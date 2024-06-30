package A6투포인터;

public class T2연속된부분수열의합 {
    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5};
        int k = 7;
        int[] result = solution(sequence, k);

        if (result[0] == -1) {
            System.out.println("해당하는 부분 수열이 없습니다.");
        } else {
            System.out.println("부분 수열의 시작 인덱스: " + result[0] + ", 끝 인덱스: " + result[1]);
        }
    }

    public static int[] solution(int[] sequence, int k) {
        int start = 0; // 시작 포인터
        int end = 0; // 끝 포인터
        int sum = sequence[0]; // 현재 부분 수열의 합
        int minLength = Integer.MAX_VALUE; // 최소 길이 저장
        int[] result = new int[2]; // 결과를 저장할 배열

        while (end < sequence.length) {
            if (sum < k) { // 부분 수열의 합이 k보다 작은 경우
                end++; // 끝 포인터를 오른쪽으로 이동
                if (end < sequence.length) {
                    sum += sequence[end]; // 새로운 요소를 합에 추가
                }
            } else if (sum > k) { // 부분 수열의 합이 k보다 큰 경우
                sum -= sequence[start]; // 시작 요소를 합에서 제거
                start++; // 시작 포인터를 오른쪽으로 이동
            } else { // 부분 수열의 합이 k인 경우
                int length = end - start + 1; // 현재 부분 수열의 길이
                if (length < minLength) { // 이전에 찾은 최소 길이보다 작은 경우
                    minLength = length; // 최소 길이 갱신
                    result[0] = start; // 시작 인덱스 저장
                    result[1] = end; // 끝 인덱스 저장
                }
                // 다음 가능한 부분 수열을 위해, 다시 시작 포인터를 이동
                sum -= sequence[start];
                start++;
            }
        }

        return result; // 결과 반환
    }
}
