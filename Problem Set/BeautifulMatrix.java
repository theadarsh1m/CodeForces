import java.util.*;

public class BeautifulMatrix {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        Scanner sc = new Scanner(System.in);

        int count = 0;

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
                if(mat[i][j] == 1) {
                    count = Math.abs(i-2) + Math.abs(2 - j);
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
