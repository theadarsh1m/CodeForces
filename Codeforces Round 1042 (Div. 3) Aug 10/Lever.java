import java.util.Scanner;

public class Lever {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0) {
            int n = sc.nextInt();
            
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
            }
            
            int iterations = 0;
            

                while (true) {
                    boolean step1 = false;
                    // boolean step2 = false;
                    iterations++;

                    for(int i = 0; i < n; i++) {
                        if(arr1[i] > arr2[i]) {
                            arr1[i]--;
                            step1 = true;
                            break;
                        }
                    }

                    for(int i = 0; i < n; i++) {
                        if(arr1[i] < arr2[i]) {
                            arr1[i]++;
                            // step2 = true;
                            break;
                        }
                    }

                    if(!step1) break;
                    
                }
            System.out.println(iterations);
        }
    }
        
    }
}
