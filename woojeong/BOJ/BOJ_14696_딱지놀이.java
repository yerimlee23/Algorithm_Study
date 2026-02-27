import java.util.*;

public class BOJ_14696_딱지놀이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int t = 0; t<N; t++) {
			int[] A = new int[5];
			int[] B= new int[5];
			
			int a = sc.nextInt();
			for(int i = 0; i<a; i++) A[sc.nextInt()]++;
			
			int b = sc.nextInt();
			for(int i = 0; i<b; i++) B[sc.nextInt()]++;
			
			
			if(A[4] > B[4] || B[4] > A[4]) {
				if(A[4] > B[4]) System.out.println("A");
				else System.out.println("B");
			}
			else if(A[3] > B[3] || B[3] > A[3]) {
				if(A[3] > B[3]) System.out.println("A");
				else System.out.println("B");
			}
			else if(A[2] > B[2] || B[2] > A[2]) {
				if(A[2] > B[2]) System.out.println("A");
				else System.out.println("B");
			}
			else if(A[1] > B[1] || B[1] > A[1]) {
				if(A[1] > B[1]) System.out.println("A");
				else System.out.println("B");
			}
			else System.out.println("D");
		}
		
	}
}
