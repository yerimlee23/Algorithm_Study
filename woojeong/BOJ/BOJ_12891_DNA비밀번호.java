//20260225

import java.util.*;

public class BOJ_12891_DNA비밀번호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dLen = sc.nextInt();
		int pLen = sc.nextInt();
		
		String dna = sc.next();
		
		//비번 최소 조건
		int[] min = new int[4]; //0: A, 1: C, 2:G, 3:T
		for(int i = 0; i<4; i++) {
			min[i] = sc.nextInt();
		}
		
		//비번 후보
		int[] pre = new int[4]; //0: A, 1: C, 2:G, 3:T
		
		int add = 0, cnt = 0; //add 는 더해진 문자 개수, cnt는 최소조건 해당하는 비번 후보 수
		for(int i = 0; i<dLen; i++) {
			switch (dna.charAt(i)) {
			case 'A':
				pre[0]++;
				add++;
				break;
			case 'C':
				pre[1]++;
				add++;
				break;
			case 'G':
				pre[2]++;
				add++;
				break;
			case 'T':
				pre[3]++;
				add++;
				break;
			}
			
			if(add == pLen) {
				if(pre[0] >=  min[0] && pre[1] >=  min[1] && pre[2] >=  min[2] && pre[3] >=  min[3]) {
					cnt++;
				}
			}
			
			if(add > pLen) {
				add--;
				switch(dna.charAt(i-pLen)) {
				case 'A':
					pre[0]--;
					break;
				case 'C':
					pre[1]--;
					break;
				case 'G':
					pre[2]--;
					break;
				case 'T':
					pre[3]--;
					break;
				}
				if(pre[0] >=  min[0] && pre[1] >=  min[1] && pre[2] >=  min[2] && pre[3] >=  min[3]) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
