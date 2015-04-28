
package homeworkday1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Type in a character: ");
        char character = in.next().charAt(0);
        int charValue = (int)character;
        if(charValue>=48 && charValue<= 57){
            System.out.println("Number");            
        }else if(charValue >= 65 && charValue <=90){
            System.out.println("Uppercase");
        }else if(charValue >= 97 && charValue <= 122){
            System.out.println("Lowercase");
        }else{
            System.out.println("Special Character");
        }        
    }
}

/*Output:
    Type in a character: 8
    Number
    Type in a character: c
    Lowercase
    Type in a character: C
    Uppercase
    Type in a character: @
    Special Character
*/
