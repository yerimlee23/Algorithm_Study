import java.util.*;

public class BOJ_2075_N번째큰수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] num = new int[N*N];
		
		for(int i = 0; i<N*N; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		System.out.println(num[(N*N)-N]);
	}
}
