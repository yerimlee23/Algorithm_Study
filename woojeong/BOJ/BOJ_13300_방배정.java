import java.util.Scanner;

public class BOJ_13300_방배정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int[][] student = new int[2][6];
        
        for (int i = 0; i < N; i++) {
            int sex = sc.nextInt();
            int grade = sc.nextInt();
            
            if (sex ==0) {
                student[0][grade -1]++;
            } else {
                student[1][grade -1]++;
            }
        }

	    int count = 0;
	
	    for (int i =0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                if(student[i][j] == 0) {
                    continue;
	            } else if (student[i][j] > K) {
		            if (student[i][j]% K == 0) { 
                       count += (student[i][j]/ K);
		            } else { 
		               count += (student[i][j]/ K)+1;
		            }
	            } else {
		            count++;
	            }

            }
        }

        System.out.println(count);
    }
}
