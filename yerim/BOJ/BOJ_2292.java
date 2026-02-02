import java.io.*;

public class BOJ_2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); //방의 개수
		
		int roomNum = 1; //지나갈 수 있는 방의 범위
		int count = 1; //지나가는 방의 개수(정답) -> 1번 방부터 시작하므로 초기값은 1
		
		//지나갈 수 있는 방의 범위가 방의 개수보다 작거나 같을 때까지만 반복문 실행
		while (roomNum < N) {
			roomNum += count * 6; //육각형 모양이므로 6씩 곱하기
			count++;
		}
		
		bw.write(count + "\n");
		bw.flush();
	}
}
