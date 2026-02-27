//20260203
//백준 브론즈2 2309번 일곱난쟁이
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2309_일곱난쟁이{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] small = new int[9]; //9명 키 담을 배열 생성
        
        int sum = 0;
        
        for(int i = 0; i<9; i++) {
        	small[i] = sc.nextInt(); //9명 키 배열에 담음
        	sum += small[i]; //9명 키 다 더함
        }
        
        Arrays.sort(small); //9명 키 오름차순 정렬
        int n1 = 0; //난쟁이 아닌 인덱스1 초기화
        int n2 = 0; //난쟁이 아닌 인덱스2 초기화
        
        for(int i = 0; i <9; i++) {
        	for(int j = i+1; j<9; j++) { //완전탐색 i, j 모든 경우의 수 
        		if ( (sum - small[i] - small[j]) == 100) { //인덱스 값 빼서 7명 합 100되는 인덱스 i, j = 가짜 난쟁이 인덱스
        			n1 = i; //난쟁이 아닌 인덱스1
        			n2 = j; //난쟁이 아닌 인덱스2
        			
        	        for(int k=0; k<9; k++) { //배열 출력하기 위한 반복문(배열크기만큼 반복)
        	        	if(!(k == n1 || k == n2)) { //인덱스가 n1이거나 n2인 경우를 제외한 나머지 인덱스(진짜 일곱난쟁이) 출력
        	        		System.out.println(small[k]);
        	        	}
        	        }
        	        return; //main 메서드 종료
        		}
        	}
        }
    }
}
