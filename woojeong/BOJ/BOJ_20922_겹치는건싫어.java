import java.util.*;

public class BOJ_20922_겹치는건싫어 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt(); 

		int[] in = new int[N];
		for (int i = 0; i < N; i++) {
			in[i] = sc.nextInt();
		}

		int st = 0, max = 0;
		int[] cnt = new int[100001]; 

		for (int j = 0; j < N; j++) {
			cnt[in[j]]++;
			
			while (cnt[in[j]] > K) { //K보다 큰경우 K-1되는 **in[st] 중복값 처음 나온 지점까지 cnt -- 
				cnt[in[st++]]--;
			}

			int len = j - st + 1;
			if (len > max)
				max = len;
		}

		System.out.println(max);
	}
}
