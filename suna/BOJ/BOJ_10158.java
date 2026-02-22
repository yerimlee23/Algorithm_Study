import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int t;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(br.readLine());
		
		r = coord(R,r);
		c = coord(C,c);
		
		System.out.println(r+" "+c);

	}
	
	public static int coord (int R, int r) {
		int tmp = t;
		// t가 R-r보다 작을 때
		if(t<=(R-r))
			r += t;
		// t>R-r일때
		else {
			// R로 이동
			tmp = t - (R-r);
			r=R;
			// 나머지만큼 이동
			tmp %= 2*R;
			r = Math.abs(R-tmp);				
		}
		return r;
	}

}

//int r = (r + t) % (2 * R);
//if (r > R) r = 2 * R - r;
//
//int c = (c + t) % (2 * C);
//if (c > C) c = 2 * C - c;







