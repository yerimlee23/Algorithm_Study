package study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class study0208_prob3계산기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int t = 1; t <= T; t++) {
			//////////////////////////
			// 1. 후위표기
			int num = sc.nextInt();
			String infix = sc.next();
			Map<Character, Integer> priority = new HashMap<>();
			priority.put('*', 2);
			priority.put('/', 2);
			priority.put('%', 2);
			priority.put('+', 1);
			priority.put('-', 1);
			priority.put('(', 0);

			StringBuilder postfix = new StringBuilder();
			Stack<Character> op = new Stack<>();

			for (int i = 0; i < infix.length(); i++) {
				char tmp = infix.charAt(i);
				// tmp가 피연산자일 때 - stack에 저장
				if (tmp >= '0' && tmp <= '9')
					postfix.append(tmp);
				// tmp가 연산자일 때
				// (를 만나면 stack
				// )를 만나면 이전까지 stack했던거 뱉어내기
				// 다른 연산자 만나면 우선순위 비교해서 높으면 stack
				// 낮으면 자기보다 낮은거 나올때까지 뱉어내기
				else if (tmp == '(') {
					op.push(tmp);
				} else if (tmp == ')') {
					while (op.peek() != '(') {
						postfix.append(op.pop());
					}
					op.pop(); // ( 버리기
				} else {
					// 현재 스택이 비어있을 경우 -> 스택에 푸쉬
					if (op.isEmpty())
						op.push(tmp);
					else {
						while (!op.isEmpty() && (priority.get(tmp) <= priority.get(op.peek()))) {
							postfix.append(op.pop());
						}
						op.push(tmp);
					}

					
				}

			}
			// op에 남은 stack전부 반출
			while(!op.isEmpty())
				postfix.append(op.pop());
			
			//2. 계산 //////////////////////////////////////
			// 피연산자 만나면 stack, 
			// 연산자 만나면 필요한 만큼 피연산자 pop, 그 결과 다시 stack
			
			Stack<Integer> cal = new Stack<>();
			for(int i = 0; i<postfix.length(); i++) {
				char tmp = postfix.charAt(i);
				// 피연산자일 경우
				if(tmp >= '0' && tmp<= '9') {
					int intemp = tmp - '0';
					cal.push(intemp);
				} 
				// 연산자일 경우
				else {
					int b = cal.pop();
					int a = cal.pop();
					switch (tmp) {
					case '+':
						cal.push(a+b);
						break;
					case '-':
						cal.push(a-b);
						break;
					case '*':
						cal.push(a*b);
						break;
					case '/':
						cal.push(a/b);
						break;
					default: // %
						cal.push(a%b);
						break;
					}
				}
			}
			
			System.out.printf("#%d %d", t, cal.pop());

			//////////////////////
		}
	}
}
