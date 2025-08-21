import java.util.*;


// D -> appned at last
// V -> append at front

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt(); // len of string a
            String a = sc.next();
            int m = sc.nextInt(); // len of strings toAppend and order
            String toAppend = sc.next();
            String order = sc.next();

            StringBuilder sb = new StringBuilder(a);

            for(int i = 0; i < m; i++) {
                char ch = toAppend.charAt(i);

                if(order.charAt(i) == 'D') {
                    sb.append(ch);
                } else {
                    sb.insert(0, ch);
                }
            }
            System.out.println(sb);
        }
        sc.close();
    }
}
