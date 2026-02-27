import java.util.*;

public class BOJ_2559_수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] temp = new int[N];
		for(int i = 0; i<N; i++) {
			temp[i] = sc.nextInt();
		}
		
		int smax = 0;
		int cnt = 0;
		int sum = 0;
		for(int i = 0; i<N; i++) {
			sum += temp[i];
			cnt++;
			
			if(cnt == K) {
				smax = sum;
			}
			
			if(cnt > K) {
				sum -= temp[i-K];
				cnt--;
				smax = Math.max(smax, sum);
			}
		}
		System.out.println(smax);
	}

}
