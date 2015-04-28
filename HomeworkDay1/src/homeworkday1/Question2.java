
package homeworkday1;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Type in amount: ");
        double amount = in.nextDouble();
        double leftOver = 0;
        
        double dollars = amount / 1;
        leftOver = amount % 1;
        double quarters = leftOver / 0.25;
        leftOver = leftOver % 0.25;
        double dimes = leftOver / 0.1;
        leftOver = leftOver % 0.1;
        double nickels = leftOver / 0.05;
        leftOver = leftOver % 0.05;
        double pennies = leftOver / 0.01;
        
        System.out.println("Your amound is " + amount);
        System.out.println((int)dollars + " dollars");
        System.out.println((int)quarters + " quarters");
        System.out.println((int)dimes + " dimes");
        System.out.println((int)nickels + " nickels");
        System.out.println((int)pennies + " pennies");     
        
    }     
}

/*Output:
    Type in amount: 11.56
    Your amound is 11.56
    11 dollars
    2 quarters
    0 dimes
    1 nickels
    1 pennies
*/