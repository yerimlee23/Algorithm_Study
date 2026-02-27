import java.util.*;

public class BOJ_1244_스위치켜고끄기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] sw = new int[N+1];
		for(int i=1; i<N+1; i++) {
			sw[i] = sc.nextInt();
		}
		
		int s = sc.nextInt();
		for(int t = 0; t < s ; t++) {
			int mf = sc.nextInt();
			int num = sc.nextInt();
			int d = 1;
			
			if(mf == 1) { //남학생
				while (num*d < N+1) {
					if (sw[num*d] == 1) sw[num*d++] = 0;
					else sw[num*d++] = 1;
				}
			} 
			else { //여학색
				if (sw[num] == 1) sw[num] = 0;
				else sw[num] = 1;

				while (num-d > 0 && num+d < N+1) {
					if (sw[num-d] == sw[num+d]) {
						if(sw[num-d] == 1) {
							sw[num-d] = 0;
							sw[num+d] = 0;
						} else {
							sw[num-d] = 1;
							sw[num+d] = 1;
						}
						d++;
					}
					else break;
				}
			}
		}
		
		for(int i = 1; i<N+1; i++) {
			System.out.print(sw[i] + " ");
            if(i % 20 == 0) System.out.println();
		}
	}
}
