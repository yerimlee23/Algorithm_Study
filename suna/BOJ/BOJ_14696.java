import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		mainloop:
		for (int i = 0; i < T; i++) {
			////////////////////////////////////////////
			int numA = sc.nextInt();
			int[] acnt = new int[4]; // 0인덱스는 4(별), 1인덱스는 3(동그라미), 2인덱스는 2(네모), 3인덱스는 1(세모)
			for (int j = 0; j < numA; j++)
				acnt[4 - sc.nextInt()]++;

			int numB = sc.nextInt();
			int[] bcnt = new int[4]; // 0인덱스는 4(별), 1인덱스는 3(동그라미), 2인덱스는 2(네모), 3인덱스는 1(세모)
			for (int j = 0; j < numB; j++)
				bcnt[4 - sc.nextInt()]++;

			// 비교
			for (int k = 0; k < 4; k++) {
				if (bcnt[k] > acnt[k]) {
					System.out.println("B");
					continue mainloop;
				} else if (bcnt[k] < acnt[k]) {
					System.out.println("A");
					continue mainloop;
				}
			}

			System.out.println("D");

			//////////////////////////////////////////
		}

	}

}
