import java.util.*;
import java.io.*;

public class BOJ_10158_개미 {
	static long reflect(long st, long move, long max) {
		long period = 2*max;
		long tmp = (st+move)%period;
		
		if(tmp <= max) return tmp;
		else return (period - tmp);
	}
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long w = Long.parseLong(st.nextToken());
        long h = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long p = Long.parseLong(st.nextToken());
        long q = Long.parseLong(st.nextToken());

        long t = Long.parseLong(br.readLine().trim());

        System.out.println(reflect(p, t, w) + " " + reflect(q, t, h));
    }
}

//Q. 버퍼리더를 안 쓰고는 할 수 없을까?
