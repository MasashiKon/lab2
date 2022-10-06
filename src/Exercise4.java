import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        
        System.out.println("How many integers will be added?");
        Scanner scan = new Scanner(System.in);
        int nums = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= nums; i++) {

            System.out.print("Enter an integer:");
            int addNum = scan.nextInt();
            sum += addNum;

        }

        System.out.printf("The sum is %d", sum);

        scan.close();

    }
}
