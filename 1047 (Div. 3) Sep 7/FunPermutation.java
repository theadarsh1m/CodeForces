import java.util.*;

public class FunPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int[] p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }

            int[] q = new int[n];
            for (int i = 0; i < n; i++) {
                q[i] = n + 1 - p[i]; //add remaining part of n is q so sum makes upto n lol
            }

            for (int i = 0; i < n; i++) {
                if (i > 0)
                    System.out.print(" ");
                System.out.print(q[i]);
            }
            System.out.println();
        }
        sc.close();
    }
}
