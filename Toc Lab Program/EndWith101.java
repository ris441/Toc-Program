import java.util.Scanner;
public class EndWith101 {
    static int counter = 0;

    static void accept101() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome In the Finite State Machine !!!");
        System.out.println("Enter the Binary String : ");
        String input = in.next();
        boolean validInfo = checkValidString(input);
        boolean ans = false;
        if (validInfo) {
            ans = working(input);
            if(ans){
                System.out.println("\n\n\n Congratulations , Your String is Accepted $$$ \n\n\n");
            }
            else{
                System.out.println("Your  String is Rejected !!!!");
            }

        } else {
            counter++;
            if (counter <= 1) {

                System.out.println("\n\n\nPlease Enter the Only Binary String ....");
                 accept101();

            }

            else if (counter <= 3) {
                System.out.println("\n\n\nDhayan se Binary String Dal...\n\n\n");
                 accept101();
            } else {

                System.out.println("Exiting the Program YOU ARE NOT UNDERSTAND AUTOMATA LANGUAGE ..//");

            }

        }

    

    }

    static boolean working(String s) {
        int n = s.length()-1;
        if(s.charAt(n)=='1'&& s.charAt(n-1)=='0' && s.charAt(n-2)=='1'){
            return true;
        }



        return false;

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
    public static void main(String [] args){
        accept101();
    }

   

}
