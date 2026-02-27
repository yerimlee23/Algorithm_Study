import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2798_블랙잭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] card = new int[N];
        for(int c = 0; c<N; c++) {
        	card[c] = sc.nextInt();
        }
        
        int[] cardS = new int[(N*(N-1)*(N-2))/6];
        int max = 0;
        
        int idx = 0;
        for(int i = 0; i<N; i++) {
        	for(int j = i+1; j<N; j++) {
        		for(int k = j+1; k<N; k++) {
        			cardS[idx++] = card[i]+card[j]+card[k];
        		}
        	}
        }
        
        Arrays.sort(cardS);
        
        for (int i = 0; i<cardS.length && cardS[i] <= M; i++) {
        	max = Math.max(max, cardS[i]);
        }
        System.out.println(max);
    }
}
