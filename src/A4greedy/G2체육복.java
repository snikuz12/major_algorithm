package A4greedy;

public class G2체육복 {
    public static void main(String[] args) {
        int n=5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        int[] uniforms = new int[n + 1];
        int count=0;

        // 모든 학생은 처음에 1벌의 체육복을 가지고 있다고 설정
        for (int i = 1; i <= n; i++) {
            uniforms[i] = 1;
        }

        // 도난당한 체육복
        for (int l : lost) {
            uniforms[l]--;
        }

        // 여벌 체육복
        for (int r : reserve) {
            uniforms[r]++;
        }

        // 체육복 빌려주기 처리
        for (int i = 1; i <= n; i++) {
            if (uniforms[i] == 0) { // 체육복이 없는 학생 찾기
                if (i > 1 && uniforms[i - 1] > 1) {
                    // 이전 학생으로부터 체육복 빌리기
                    uniforms[i]++;
                    uniforms[i - 1]--;
                } else if (i < n && uniforms[i + 1] > 1) {
                    // 다음 학생으로부터 체육복 빌리기
                    uniforms[i]++;
                    uniforms[i + 1]--;
                }
            }
        }

        // 체육수업을 들을 수 있는 학생 수 계산
        for (int i = 1; i <= n; i++) {
            if (uniforms[i] >= 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
