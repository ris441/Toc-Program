import java.util.Scanner;
public class BinaryNumberIncrementByone {
    
    static int counter = 0;

    static void incrementByOne() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome In the Finite State Machine !!!");
        System.out.println("Enter the Binary Number : ");
        String input = in.next();
        boolean validInfo = checkValidString(input);
        boolean ans = false;
        if (validInfo) {
            // int binary = Integer.parseInt(input,2);
            working(input);
            

        } else {
            counter++;
            if (counter <= 1) {

                System.out.println("\n\n\nPlease Enter the Only Binary String ....");
                incrementByOne();

            }

            else if (counter <= 3) {
                System.out.println("\n\n\nDhayan se Binary String Dal...\n\n\n");
                incrementByOne();
            } else {

                System.out.println("Exiting the Program YOU ARE NOT UNDERSTAND AUTOMATA LANGUAGE ..//");

            }

        }

    

    }

    static void working(String bn) {
        int l = bn.length();
        boolean flag = false;
        for(int i = l-1; i>=0; i--){
            if(bn.charAt(i)=='0'){
                
                bn=bn.substring(0,i)+'1'+bn.substring(i+1);
                flag = true;
                break;

            }
            else{
                
                bn=bn.substring(0,i)+'0'+bn.substring(i+1);  
            }
        }
        if(flag){
            System.out.println("The Binary Number (that is incremented by one ) is ==> "+ bn);
        }
        else{
            System.out.println("The Restultant Binary Number ==> "+'1'+bn);

        }

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
    
        incrementByOne();
    }

}
