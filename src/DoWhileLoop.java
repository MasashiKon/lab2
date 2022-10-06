public class DoWhileLoop {
    
    public static void main(String[] args) {
        
        int num = 5;

        //will run the loop AT LEAST once before checking the conditional statement
        do {
            System.out.println("value of num is: " + num);
            num++;
        }
        while(num <= 10);
    }
}
