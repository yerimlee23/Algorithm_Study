//20260202
//백준 브론즈2 2292번 벌집
import java.util.Scanner;

public class BOJ_2292{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //방 번호
        int sum = 1; //(이동횟수별)방 번호 구간 최댓값
        int num = 0;//이동횟수
        
        int i = 0;
        for(;;) {
            sum += i*6; //다음 구간 최댓값
            num ++; //이동횟수 1증가
            if (sum >= N) { //N이 구간 최댓값보다 같거나 작을 때 num은 최소 이동횟수
                System.out.println(num);
                break;
            }
            i++; //N 구간 내 포함 X 시 반복 진행
        }
    }
}