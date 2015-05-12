
package homeworkweek3day1;

import java.util.Stack;


public class PalindromeRecursive {
    static Stack<Character> letters = new Stack<Character>();
    static int o = 0;
    
    public static void main(String[] args){
        System.out.println("racecar: " + isPalindrome("racecar"));
        System.out.println("power: " + isPalindrome("power"));
        System.out.println("ramamar: " + isPalindrome("ramamar"));
        
    }
    
    public static boolean isPalindrome(String word){
        if(word.length() == 0 || word.length() == 1){
            return true;
        } else {
            if(word.charAt(0) == word.charAt(word.length()-1)){
                return isPalindrome(word.substring(1, word.length()-1));
            }
            return false;
        }
        
    }
    
}

/*Output:
racecar: true
power: false
ramamar: true
*/