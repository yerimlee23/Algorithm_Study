import java.util.Scanner;

public class BOJ_1436_영화감독숌 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int count = 0;
        int num = 666;
        
        for(;;) {
            if (String.valueOf(num).contains("666")) {
                count++;
            }
            //int -> String
            
            if (count == N) {
                System.out.println(num);
                break;
            }
            
            num++;
        }
    }
}
