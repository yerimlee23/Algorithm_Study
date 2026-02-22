import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] rc = new int[sc.nextInt()+1];
	int M = sc.nextInt();
	int expId = 1;
	int expVal = 0;
	int realId = 1;
	int realVal = 0;
	
	for(int i = 1; i<=M; i++) { // i는 사람 인덱스
		int expTmp = 0, realTmp = 0;
		int L = sc.nextInt();
		int R = sc.nextInt();
		for(int j = L; j<=R; j++, expTmp++) {
			if(rc[j]== 0) {
				rc[j] = i;
				realTmp++;
			}
		}
		if(expVal < expTmp) {
			expId = i;
			expVal = expTmp;
		}
		if(realVal < realTmp) {
			realId = i;
			realVal = realTmp;
		}
	}
	
	System.out.println(expId);
	System.out.println(realId);
	
}
}
