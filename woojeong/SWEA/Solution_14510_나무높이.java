import java.util.*;

public class Solution_14510_나무높이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // 나무 개수 2~100

			int max = 0;
			
			int even=0;
			int odd=0;
			
			int days = 0;
			int[] tree = new int[N];
			// 물준 날이 짝수면 2/홀수면 1 자람

			// 모든 나무의 키가 처음에 가장 키가 컸던 나무와 같아지도록 할 수 있는 최소 날짜 수

			for (int i = 0; i < N; i++) {
				int tall = sc.nextInt();
				tree[i] = tall;
				max = Math.max(max, tall);
			}

			for (int i = 0; i < N; i++) {
				tree[i] = max - tree[i];
			}

			Arrays.sort(tree);
			for(int i=0;i<N;i++){
			    if(tree[i] == 0) continue;

			    if((tree[i]-1)%3 == 0){
			        int k = (tree[i]-1)/3;
			        odd += k+1;
			        even += k;
			    }
			    else if((tree[i]-2)%3 == 0){
			        int k = (tree[i]-2)/3;
			        odd += k;
			        even += k+1;
			    }
			    else{
			        int k = tree[i]/3;
			        odd += k;
			        even += k;
			    }
			}
			
			while (even > odd + 1) {
			    even--;
			    odd += 2;
			}
			

			if (odd > even)
			    days = odd * 2 - 1;
			else
			    days = even * 2;
			
			
			System.out.println(tc + " " + days);
			
			// 물은 한 번에 한 그루만 줄 수 있음
		}
	}
}
