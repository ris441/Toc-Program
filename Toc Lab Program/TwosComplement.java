import java.util.Scanner;

public class TwosComplement {

    static int counter = 0;

    static void twos_Complement() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome In the Finite State Machine !!!");
        System.out.println("Enter the Binary String : ");
        String input = in.next();
        boolean validInfo = checkValidString(input);
        boolean ans = false;
        if (validInfo) {
            working(input);
            

        } else {
            counter++;
            if (counter <= 1) {

                System.out.println("\n\n\nPlease Enter the Only Binary String ....");
                twos_Complement();

            }

            else if (counter <= 3) {
                System.out.println("\n\n\nDhayan se Binary String Dal...\n\n\n");
                twos_Complement();
            } else {

                System.out.println("Exiting the Program YOU ARE NOT UNDERSTAND AUTOMATA LANGUAGE ..//");

            }

        }

    

    }

    static void working(String s) {
        int n = s.length();
        int i ;
        for (i=n-1; i >= 0 ; i--){
            if(s.charAt(i)=='1') break;
        }
        if(i==-1){
            System.out.println("The Resultant Binary String is =>   "+'1'+s);
        }
        for(int j=i-1; j>=0; j--){
            if(s.charAt(j)=='1'){
                s=s.substring(0,j)+'0'+s.substring(j+1);
            }
            else{
                s=s.substring(0,j)+'1'+s.substring(j+1);
            }
        }
        System.out.println("2's complement of Given String : "+ s);


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
    
        twos_Complement();
    }

    
}
