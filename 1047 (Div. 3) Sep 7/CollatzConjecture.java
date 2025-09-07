
import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- != 0) {
            int k = sc.nextInt();
            int x = sc.nextInt();

            while(k != 0) {  // going backwards
                if((x - 1) % 3 == 0 && ((x - 1) / 3) % 2 == 1) {
                     x = (x - 1) / 3;
                } else {
                    x = x * 2;
                }
                k--;
            }
            System.out.println(x);


        }
        sc.close();
    }
}