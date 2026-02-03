//20260204
//백준 실버5 색종이
import java.util.Scanner;

public class BOJ_2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] square = new int[100][100]; //넓이 표현 2차원 배열
		int num = sc.nextInt(); //10*10 검은 색종이 수
		
		for(int t = 0; t < num ; t++) { //입력된 검은 색종이 수만큼 반복
			int x = sc.nextInt(); //색종이 왼쪽 변 - 도화지 왼쪽 변
			int y = sc.nextInt(); //색종이 아래쪽 변 - 도화지 아래쪽 변
			
			for(int i = x; i<x+10; i++) { //검은 색종이 있는 영역 (x,y) (x+10, y)
				for(int j = y; j<y+10;j++) { //검은 색종이 있는 영역 ~(x, y+10) (x+10, y+10)
					square[i][j] = 1; //검은 종이 있는 1*1영역에 1 저장
				}
			}
			
		}
			
		int sum = 0; //총 넓이 합 sum 변수 초기화
		for(int i = 0; i <100 ; i++) { //square 배열 순회(완전탐색)
			for(int j = 0; j<100 ; j++) {
				sum += square[i][j]; //sum에 square[모든인덱스] 값 누적합 = 넓이
			}
		}
		System.out.println(sum); //넓이sum 출력
	}
}