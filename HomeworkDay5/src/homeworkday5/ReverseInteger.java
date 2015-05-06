
package homeworkday5;
import java.util.Scanner;

public class ReverseInteger {
    
    private int size;    
    private UserQueue num;
    private int length;
    
            
    public ReverseInteger(int n){
        length = (int)(Math.log10(n)+1);
        num = new UserQueue(length);
        int number;
        while(n > 10){
            num.insert(n%10);
            n = n/10;
        }
        num.insert(n);
        System.out.print("Reversed: ");
        System.out.print(num.remove());
        while(!num.isEmpty()){
            System.out.print(num.remove());
        }
    }
    
    public static void main(String[] args){
        ReverseInteger ri;
        Scanner in = new Scanner(System.in);
        System.out.println("Type in a number to reverse: ");
        int input = in.nextInt();
        ri = new ReverseInteger(input);
    }
}

/*
Type in a number to reverse: 
123456789
Reversed: 987654321
*/