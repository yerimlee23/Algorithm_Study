import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();  // 롤케이크 길이
        int N = sc.nextInt();  // 사람 수

        int[] cake = new int[L + 1];

        int expectedMax = 0;
        int expectedPerson = 0;

        int realMax = 0;
        int realPerson = 0;

        for (int i = 1; i <= N; i++) {
            int P = sc.nextInt();
            int K = sc.nextInt();

            // 기대값 계산
            int expected = K - P + 1;
            if (expected > expectedMax) {
                expectedMax = expected;
                expectedPerson = i;
            }

            // 실제 분배
            int count = 0;
            for (int j = P; j <= K; j++) {
                if (cake[j] == 0) {
                    cake[j] = i;
                    count++;
                }
            }

            if (count > realMax) {
                realMax = count;
                realPerson = i;
            }
        }

        System.out.println(expectedPerson);
        System.out.println(realPerson);
    }
}
