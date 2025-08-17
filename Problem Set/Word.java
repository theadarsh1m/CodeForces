import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int lower = 0;
        int upper = 0;

        for(char ch : s.toCharArray()) {
            if(Character.isUpperCase(ch)) upper++;
            else lower++;
        }
        if(upper > lower) System.out.println(s.toUpperCase());
        else System.out.println(s.toLowerCase());
        sc.close();
    }
}