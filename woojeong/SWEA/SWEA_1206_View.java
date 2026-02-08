import java.util.Scanner;

class Solution{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        
		for (int tc = 1; tc <= 10; tc++) {
            int N = sc.nextInt();
            int[] build = new int[N];
            
        	for(int i = 0; i < N ; i++){
            	build[i] = sc.nextInt();
        	}//for i	
        	
            int view = 0; //총 조망권 수
            
        	for(int i = 2; i < N-2 ; i++) { //양측 2개씩 층수 0으로 고정 -> 제외
                int max = 0; //i-2~ i+2까지 빌딩 최대 높이(i 높이 제외)
        		for (int j = i-2; j <= i+2; j++) { //i-2~ i+2까지 비교하기 위함(좌우 2칸이상 공백있을 시 조망권)
                    if (i != j) {//i 빌딩 높이 제외한 빌딩 중 최대 높이
                    	max = Math.max(max, build[j]);
                	}
           	 	}
            	if (max<build[i]) { //i 높이가 max 보다 커야지만 i빌딩의 조망권 존재함
                	view += (build[i]-max); //i높이에서 max를 빼면 i빌딩의 조망권 개수 얻음
           	 	}
        	}//for i
            System.out.println("#" +tc+ " " + view);
        }//for tc
	}//main
}