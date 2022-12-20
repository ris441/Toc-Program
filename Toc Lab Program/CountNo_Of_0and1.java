import java.util.Scanner;
public class CountNo_Of_0and1 {

    static int counter = 0;

    static void Count_Of_0and1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome In the Finite State Machine !!!");
        System.out.println("Enter the Binary String : ");
        String input = in.next();
        boolean validInfo = checkValidString(input);
        
        if (validInfo) {
             working(input);
           

        } else {
            counter++;
            if (counter <= 1) {

                System.out.println("\n\n\nPlease Enter the Only Binary String ....");
                Count_Of_0and1();

            }

            else if (counter <= 3) {
                System.out.println("\n\n\nDhayan se Binary String Dal...\n\n\n");
                Count_Of_0and1();
            } else {

                System.out.println("Exiting the Program YOU ARE NOT UNDERSTAND AUTOMATA LANGUAGE ..//");

            }

        }

    

    }

    static void working(String s) {
        int count0=0,count1=0;
        for(int i =0 ; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                count0++;
            }
            else{
                count1++;
            }
        }
        System.out.println("No. of 0's in Binary String => "+count0);
        
        System.out.println("No. of 1's in Binary String => "+count1);
        


        

    }

    static boolean checkValidString(String s) {
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0' && s.charAt(i) != '1') {
                return false;

            }

        }

        return flag;
    }

    public static void main(String[] args) {
    
        Count_Of_0and1();
    }

}
