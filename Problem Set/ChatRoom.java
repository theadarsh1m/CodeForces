import java.util.*;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;

        for(char ch : s.toCharArray()) {
            if(ch == 'h' && count == 0) {
                count++;
            }

            else if(ch == 'e' && count == 1) count++;
            else if(ch == 'l' && count == 2) count++;
            else if(ch == 'l' && count == 3) count++;
            else if(ch == 'o' && count == 4) count++;
        }
        sc.close();
        if(count == 5) System.out.println("YES");
        else System.out.println("NO");
    }
}
