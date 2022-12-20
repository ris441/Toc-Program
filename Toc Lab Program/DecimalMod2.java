import java.util.Scanner;
public class DecimalMod2 {
    static int counter = 0;

    static void isDivisibleby2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome In the Finite State Machine !!!");
        System.out.println("Enter the Decimal Number : ");
        int input = in.nextInt();
        boolean ans = false;
            ans = working(input);
            if(ans){
                System.out.println("\n\n\n Congratulations , Your Decimal Number is Accepted $$$ \n\n\n");
            }
            else{
                System.out.println("Your  Decimal Number  is Rejected !!!!");
            }
    }

    static boolean working(int s) {

        if(s%2==0){
            return true;
        }

        return false;

    }


    public static void main(String[] args) {
    
       isDivisibleby2();
    }
    
}
