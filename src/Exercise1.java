import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        System.out.print("Input the start: ");
        Scanner scan = new Scanner(System.in);
        int startNum = scan.nextInt();

        
        System.out.print("Input the end: ");
        Scanner scan2 = new Scanner(System.in);
        int endNum = scan2.nextInt();

        for (int i = startNum; i <= endNum; i++) {

            System.out.println(i);

        }

        scan.close();
        scan2.close();
    }

}
