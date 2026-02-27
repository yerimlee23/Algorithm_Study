import java.util.*;

public class BOJ_2810_컵홀더 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String seat =sc.next();
		int ch = 1;
		for(int i = 0; i<N; i++) {
			if (seat.charAt(i) == 'S') ch++;
			else {
				ch++;
				i++;
			}
		}
		if(ch>N) System.out.println(N);
		else System.out.println(ch);
	}
}
