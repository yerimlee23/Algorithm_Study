//20260202
//백준 브론즈2 2292번 벌집
import java.util.Scanner;

public class BOJ_2292_벌집{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //방 번호
        int sum = 1; //(이동횟수별)방 번호 구간 최댓값
        int num = 1;//이동횟수
        
        while(N > sum) { //구간 최댓값 sum보다 N(방번호)이 크면 이동횟수(구간) num 증가++ 반복
            sum += num*6; //다음 구간 최댓값
            num ++; //이동횟수 1증가
        }
        System.out.println(num); //N이 구간최댓값 sum
    }
}
