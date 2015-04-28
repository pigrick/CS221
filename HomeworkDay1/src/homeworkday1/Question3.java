
package homeworkday1;
import java.util.Scanner;


public class Question3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = in.nextInt();
        
        int check;
        int odd = 0;
        int even = 0;
        int zero = 0;
        
        while(number != 0){
            check = number % 10;
            if (check % 10 == 0){
                zero++;
            }else if(check % 2 == 0){
                even++;
            }else{
                odd++;
            }
            number = number / 10;
        }
        System.out.println(odd + " odd");
        System.out.println(even + " even");
        System.out.println(zero + " zero");
    }
}

/*Output:
    Type a number: 123040
    2 odd
    2 even
    2 zero
*/
