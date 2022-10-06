public class WhileLoop {
    public static void main(String[] args) throws Exception {
        
        int x = 0;
        int y = 0;

        
        while(x != 4){
            // y += x;
            // x += 1;
            y += x;
        }

        System.out.println("Value of y = " + y);
        System.out.println("Value of x = " + x);
    }
}
