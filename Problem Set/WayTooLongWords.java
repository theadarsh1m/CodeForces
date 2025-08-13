
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            String str = sc.nextLine();
            int len = str.length();
            if (len > 10) {
                len = len - 2;
                str = str.charAt(0) + Integer.toString(len) + str.charAt(len + 1);
            }

            System.out.println(str);
        }
        sc.close();
        
    }
}
