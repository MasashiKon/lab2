public class ForLoop {
    
    public static void main(String[] args) {
        
        // for(expression for init ; expression for testing ; expression for updating){
        //     //body
        // }

        for(int i = 0; i < 10; i++){
            System.out.println("Value of i: "+i);
        }

        //equivalent whileloop of above forloop
        int i = 0;
        while(i < 10){
            System.out.println("Value of i: "+i);
            i++;
        }

        //nested forloop
        // for(expression for init ; expression for testing ; expression for updating){
        //  for(expression for init ; expression for testing ; expression for updating){
        //     //body
        //  }
        // }

        int input = 5;
        System.out.println("How many burgers will you eat?");
        System.out.println("I will eat: " +input+ " burgers");

        for(int x = 0;x<input;x++){ //outer forloop
            for(int j = 3; j > 0;j--){ //inner forloop
                System.out.println(j + " ");   
            }
            System.out.println("Burger " + (x + 1) + " has been eaten");
        }

        System.out.println("All burgers have been eaten");

    }
}
