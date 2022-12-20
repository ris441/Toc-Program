import java.util.Scanner;

public class Equal_a_b_c {
    static int counter = 0;

    static void isEqualNo_Of_a_b_andc() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome In the Finite State Machine !!!");
        System.out.println("Enter the  String(that contain only a,b,c) : ");
        String input = in.next();
        boolean validInfo = checkValidString(input);
        boolean ans = false;
        if (validInfo) {
            ans = working(input);
            if(ans){
                System.out.println("\n Congratulations , Your String is Accepted $$$ \n");
                System.out.println("The Given String is containing equal no. of a, b and c's .");
            }
            else{
                System.out.println("Your Given  String is Rejected !!!!");
            }

        } else {
            counter++;
            if (counter <= 1) {

                System.out.println("\n\n\nPlease Enter the Only Valid String ....");
                isEqualNo_Of_a_b_andc();

            }

            else if (counter <= 3) {
                System.out.println("\n\n\nDhayan se String Dal jisme a, b,or c ho bass ...\n\n\n");
                isEqualNo_Of_a_b_andc();
            } else {

                System.out.println("Exiting the Program \n YOU ARE NOT UNDERSTAND AUTOMATA LANGUAGE ..//");

            }

        }

    

    }

    static boolean working(String s) {
        int counta=0,countb=0,countc=0;
        for(int i =0 ; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                counta++;
            }
            else if (s.charAt(i)=='b'){
                countb++;
            }

            else{
                countc++;
            }
        }
        if(counta==countb && countb==countc){
            return true;
        }


        return false;

    }

    static boolean checkValidString(String s) {
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'b' && s.charAt(i) != 'c') {
                return false;

            }   

        }

        return flag;
    }

    public static void main(String[] args) {
    
        isEqualNo_Of_a_b_andc();
    }
}
