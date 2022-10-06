public class BreakAndContinue {
    
    public static void main(String[] args) {
        
        System.out.println("Before the loop");

        for(int i = 1; i <= 5; i++){

            if(i == 3){
                // break;
                continue;
            }
            System.out.println(i);
        }

        System.out.println("After the loop");
    }
}
