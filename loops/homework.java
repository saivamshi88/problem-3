package loops;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;
            for(n = 1 ; n <= 2;n ++){
                sum = sum + n;

            }
            System.out.println(sum);
        }
    }
    
}
