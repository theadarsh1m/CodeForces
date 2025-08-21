
import java.math.BigInteger;
import java.util.*;

public class TheSecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        // y = x*10^k
        // n = x + y
        // n = x + x*10^k
        // n = x(1 + 10^k)
        // x = n / (1 + 10^k)

        while (t-- > 0) {
            BigInteger n = sc.nextBigInteger();
            List<BigInteger> res = new ArrayList<>();

            for (int k = 1; k <= 18; k++) {
                BigInteger divisor = BigInteger.TEN.pow(k).add(BigInteger.ONE); // ten ki power k fir add 1
                if (n.mod(divisor).equals(BigInteger.ZERO)) { // if n % divisor == 0(biginteger ka 0) 
                    res.add(n.divide(divisor));
                }
            }

            if (res.isEmpty()) {
                System.out.println(0);
            } else {
                Collections.sort(res);
                System.out.println(res.size());
                for (int i = 0; i < res.size(); i++) {
                    if (i > 0)
                        System.out.print(" ");
                    System.out.print(res.get(i));
                }
                System.out.println();
            }
        }
        sc.close();

    }
}
