import java.util.*;

public class BOJ_2851_ 슈퍼마리오 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int g1 = 0;
		int g2 = 0;
		
		for (int i = 0; i < 10; i++) {
			int tmp = sc.nextInt();
			if(g1+tmp >= 100) {
				g2 = g1+tmp;
				break;
			}
			g1 += tmp; // g1은 100미만 값
		}
		
		if (g2 == 0) System.out.println(g1);
		else if ((100 - g1) < (g2 - 100))
			System.out.println(g1);
		else //같으면 g2출력
			System.out.println(g2);
	}
}
