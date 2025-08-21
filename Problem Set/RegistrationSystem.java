
import java.util.*;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume the leftover newline This discards the '\n'
        Map<String, Integer> mp = new HashMap<>();

        for(int i = 1; i <= n; i++) {
            String name = sc.nextLine();

            if(mp.containsKey(name)) {
                System.out.println(name + mp.get(name));
                mp.put(name, mp.getOrDefault(name, 0) + 1);
            } else {
                mp.put(name, 1);
                System.out.println("OK");
            }
        }
        sc.close();
    }
}
