import java.util.Scanner;

public class Exercise2 {
     public static void main(String[] args) {
        
        System.out.print("Input the N: ");
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.printf("The sum of 1 to %d is %d", n, sum);

        scan.close();
     }
}
