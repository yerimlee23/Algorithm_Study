import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next().replace("c=", "1").replace("c-", "2").replace("dz=", "3").replace("d-", "4").replace("lj", "5").replace("nj", "6").replace("s=", "7").replace("z=", "8").length());
	}
}

//public class Main{
//	public static void main(String[] args) {
//		System.out.println(new Scanner(System.in).next().replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", " ").length());
//	}
//}
