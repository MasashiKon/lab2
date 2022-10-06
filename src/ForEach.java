public class ForEach {
    
    public static void main(String[] args) {
        
        int[] marks = {123,56,90,11,150,116};

        int highest_mark = marks[0];

        for(int mark: marks){
            if(mark > highest_mark){
                highest_mark = mark;
            }
        }

        System.out.println("The highest mark is: " + highest_mark);
    }
}
