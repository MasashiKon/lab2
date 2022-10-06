import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        System.out.print("Enter a word:");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        for (int i = 1; i <= word.length(); i ++) {

            System.out.println(word);

        }

        scan.close();

    }
}
