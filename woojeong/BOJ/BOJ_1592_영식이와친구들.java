//20260201
//백준 브론즈2 1592 영식이와친구들

import java.util.Scanner;

public class BOJ_1592_영식이와친구들 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //사람수
        int M = sc.nextInt(); //공 받은 횟수(종료)
        int L = sc.nextInt(); //공 던지는 규칙(L번째 사람)
        sc.close();
        
        int[] arr = new int[N]; //모든 자리 공 받은 횟수 기본값 0
        
        int idx = 0;

        arr[0] = 1; //1번 자리 사람 공 받은 횟수 1로 시작
        int count = 0;
        
        while(true) {
            if (arr[idx] == M) { //M이면 공 던지는 것 종료(반복문 탈출)
                break;
            }
            
            if (arr[idx]%2 == 1) { //던질 사람 공 받은 횟수 홀수
		            idx = (idx + L) % N; //시계방향 - 공 받는 사람 위치(던질 자리 재설정)
            } else { //던질 사람 공 받은 횟수 짝수
		            idx = (idx - L + N) % N; //반시계방향 - 공 받는 사람 위치(던질 자리 재설정)
            }
            
            arr[idx]++; //공 받은 사람 받은 횟수 1증가
            
            count++; //공 던진 총 횟수 1증가
            
        }//while
        System.out.println(count);
    }//main
}
