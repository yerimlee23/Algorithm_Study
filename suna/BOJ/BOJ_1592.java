import java.util.Scanner;

public class test {

	public static int cycle(int L, int N, int status) {
		return (status + L) % N;

	}// (1+L)%N

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();

		int cylnum = 1;
		int cnt = 0;
		do {
			cylnum = cycle(L, N, cylnum);
			cnt++;
		} while (cylnum != 1);

		System.out.println(cnt * (M - 1));
	}
}