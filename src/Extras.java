import java.util.Scanner;

public class Extras {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner("Hello World!");
        System.out.println("" + scan.hasNext());
        System.out.println("" + scan.next());
        System.out.println("" + scan.hasNext());
        System.out.println("" + scan.next());
        System.out.println("" + scan.hasNext());

        ///////

        Scanner scan2 = new Scanner("John Doe");
        System.out.println("Delimeter: " + scan2.delimiter());

        while(scan2.hasNext()){
            System.out.println(scan2.next());
        }


        ///////

        Scanner scan3 = new Scanner("Yuno/18/Japan/Earrings");
        scan3.useDelimiter("/");

        while(scan3.hasNext()){
            System.out.println(scan3.next());
        }


        scan.close();
        scan2.close();
        scan3.close();

    }
}
