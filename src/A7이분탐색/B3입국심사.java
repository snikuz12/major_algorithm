package A7이분탐색;

import java.util.*;

public class B3입국심사 {
    public static void main(String[] args) {
        B3입국심사 solution = new B3입국심사();
        int n = 6;
        int[] times = {7,10};
        System.out.println(solution(n, times));
    }

    public static long solution(int n, int[] times){
        long start = 1;
        Arrays.sort(times);
        long end = times[times.length-1]*n;
        long answer = end;

        while(start <= end){
            long mid = (start + end) / 2;  // 30
            int p = 0;

            for(int t : times){
                p += mid/t;
            }

            if(p >= n){
                answer=mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return answer;
    }
}

/*
public class Solution {

    // 주어진 n명의 사람을 주어진 심사 시간 배열을 이용하여 심사하는데 걸리는 최소 시간을 찾는 함수
    public static long solution(int n, int[] times) {
        long start = 1;
        Arrays.sort(times);
        long end = (long)times[times.length - 1] * n;
        long answer = end;


        while (start <= end) {
            long p = 0; // 현재 시간 동안 심사할 수 있는 사람 수를 저장할 변수
            long mid = (start + end) / 2;

            // 각 심사관에 대해 현재 중간값 시간 동안 심사할 수 있는 사람 수를 계산
            for (int t : times) {
                p += mid / t; // 현재 심사관이 중간값 시간 동안 심사할 수 있는 사람 수를 더함
                System.out.println(p);
            }

            // 심사할 수 있는 사람 수가 주어진 사람 수보다 크거나 같은 경우
            if (p >= n) {
                answer = mid; // 현재 중간값을 최소 시간 후보로 저장
                end = mid - 1; // 최대 시간을 중간값 바로 아래로 설정
            } else { // 심사할 수 있는 사람 수가 부족한 경우
                start = mid + 1; // 최소 시간을 중간값 바로 위로 설정
            }
        }
        return answer;
    }
}
*/