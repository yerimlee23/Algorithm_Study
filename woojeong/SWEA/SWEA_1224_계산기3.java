import java.util.Scanner;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

class SWEA_1224_계산기3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for (int tc = 1; tc <= 10 ; tc++) {
			int len = sc.nextInt(); //테스트케이스 길이
			String infix = sc.next(); //테스트케이스 수식
			
			Stack<Character> op = new Stack<>(); //후위표기식 변환시 연산자 담을 stack
			Stack<Integer> opnd = new Stack<>(); //후위표기식 계산시 피연산자 담을 stack
			
			StringBuilder postfix = new StringBuilder(); //후위표기식 저장할 stringbuilder
			
			//연산자 우선순위 Map
			Map<Character, Integer> priority = new HashMap<>();
			priority.put('*', 2); 
			priority.put('+', 1);
			priority.put('(', 0);
			
			
			//1. 후위표기식 변환 for문
			for(int i = 0; i<len; i++) { 
				char tmp = infix.charAt(i);
				
				//피연산자 stringbuilder에 append
				if (tmp >= '0' && tmp <= '9') { //피연산자는 후위표기식에 바로 append
					postfix.append(tmp);
				}
				
				//연산자 stack에 push
				else if (tmp == '(') op.push(tmp); //열린괄호 stack에 push
				else if (tmp == ')') { //닫힌 괄호 
					while(!op.isEmpty() && op.peek() != '(') postfix.append(op.pop()); //stack의 top이 열린괄호일 때까지(열린괄호면 false돼서 종료) pop() -> stringbuilder에 append
					op.pop();//열린괄호 제거
				}
				else {
					//peek()가 우선순위 맵에 있는지 확인 
					while (!op.isEmpty() && ( priority.get(op.peek()) >= priority.get(tmp))) postfix.append(op.pop()); //우선순위 높은 것을 먼저 후위표기식에 추가
					op.push(tmp);//+ *는 우선순위에 맞게 후위표기식에 append한 후 순서에 맞게 stack에 tmp push
				}
			}
			//남은 연산자 후위표기식 마지막에 붙이기	
			while (!op.isEmpty()) postfix.append(op.pop());
			
			
			//2. 후위표기식 계산 for문
			for(int i = 0; i<postfix.length(); i++) {
				char tmp = postfix.charAt(i);
				
				//피연산자 stack에 push
				if (tmp >= '0' && tmp <= '9') {
					opnd.push(tmp - '0');
				}
				//연산자 -> stack에서 B, A  pop 후 A 연산자 B => stack에 push
				else {
					if (tmp == '*') {
						int B = opnd.pop();
						int A = opnd.pop();
						opnd.push(A*B);
					}
					else if (tmp == '+') {
						int B = opnd.pop();
						int A = opnd.pop();
						opnd.push(A+B);
					}
				}
			}
			System.out.println("#" + tc + " " + opnd.pop());
		}
	}
}