package A7이분탐색;

public class B1Basic {
    public static void main(String[] args) {
        // 이분탐색은 사전에 오름차순 정렬이 되어 있어야 가능한 알고리즘
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 5;
        int result = binarySearch(arr, target);

        if(result == -1) {
            System.out.println("없음");
        } else {
            System.out.println(result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0; // 배열의 시작 인덱스
        int right = arr.length - 1; // 배열의 끝 인덱스

        while(left <= right) {
            int mid = left + (right - left) / 2; // 중간 인덱스 계산

            // 중간 값이 목표 값과 일치하는지 확인
            if(arr[mid] == target) {
                return mid; // 목표 값을 찾았으면 중간 인덱스를 반환
            }

            // 중간 값이 목표 값보다 작으면, 왼쪽 절반을 무시
            if(arr[mid] < target) {
                left = mid + 1;
            }
            // 중간 값이 목표 값보다 크면, 오른쪽 절반을 무시
            else {
                right = mid - 1;
            }
        }

        // 타겟없음
        return -1;
    }
}
