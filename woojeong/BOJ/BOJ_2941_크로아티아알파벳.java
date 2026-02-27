import java.util.Scanner;

public class BOJ_2941_크로아티아알파벳 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int count = 0;
        int i = 0;

        while (i < word.length()) {
            if (i + 2 < word.length() && word.substring(i, i + 3).equals("dz=")) {
                i += 3;
            } 
            else if (i + 1 < word.length() && (
                    word.substring(i, i + 2).equals("c=") ||
                    word.substring(i, i + 2).equals("c-") ||
                    word.substring(i, i + 2).equals("d-") ||
                    word.substring(i, i + 2).equals("lj") ||
                    word.substring(i, i + 2).equals("nj") ||
                    word.substring(i, i + 2).equals("s=") ||
                    word.substring(i, i + 2).equals("z=")
            )) {
                i += 2;
            } 
            else {
                i += 1;
            }
            count++;
        }

        System.out.println(count);
    }
}
