import java.util.Scanner;
public class Equal1and0 {
    static int counter = 0;

    static void isEqualNo_Of_0and1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome In the Finite State Machine !!!");
        System.out.println("Enter the Binary String : ");
        String input = in.next();
        boolean validInfo = checkValidString(input);
        boolean ans = false;
        if (validInfo) {
            ans = working(input);
            if(ans){
                System.out.println("\n Congratulations , Your String is Accepted $$$ \n");
                System.out.println("The Given String is containing equal no. of 1 and 0 's .");
            }
            else{
                System.out.println("Your  String is Rejected !!!!");
            }

        } else {
            counter++;
            if (counter <= 1) {

                System.out.println("\n\n\nPlease Enter the Only Binary String ....");
                isEqualNo_Of_0and1();

            }

            else if (counter <= 3) {
                System.out.println("\n\n\nDhayan se Binary String Dal...\n\n\n");
                isEqualNo_Of_0and1();
            } else {

                System.out.println("Exiting the Program YOU ARE NOT UNDERSTAND AUTOMATA LANGUAGE ..//");

            }

        }

    

    }

    static boolean working(String s) {
        int count0=0,count1=0;
        for(int i =0 ; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                count0++;
            }
            else{
                count1++;
            }
        }
        if(count0==count1){
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

    public static void main(String[] args) {
    
        isEqualNo_Of_0and1();
    }
}
