import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		int cnt = 0;
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='L')
				cnt ++;
		}
		
		cnt = N+1 -cnt/2; // 총 컵홀더 수
		
		System.out.println(Math.min(cnt, N));
		
		
	}
}

//public class Main{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println(Math.min(sc.nextInt(), sc.next().replace("LL","L").length()+1));
//	}
//	
//}
