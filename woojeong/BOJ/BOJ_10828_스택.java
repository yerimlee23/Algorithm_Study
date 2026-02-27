import java.util.*;

public class BOJ_10828_스택 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Stack<Integer> save = new Stack<>();
		int N = sc.nextInt();
		int[] stack = new int[N];
		
		int top = -1; 
		
		for(int i = 0; i<N; i++) {
			String com = sc.next();
			
			switch (com) {
			case "push":
				stack[++top] = sc.nextInt();
				break;
			case "pop":
				if(top == -1) {
					System.out.println(-1);
				} else {
					System.out.println(stack[top]);
					stack[top--] = 0;
				}
				break;
			case "size":
				System.out.println(top + 1);
				break;
			case "empty":
				if(top == -1) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "top":
				if(top == -1) {
					System.out.println(-1);
				} else {
					System.out.println(stack[top]);
				}
				break;	
			}		
		}
	}
}