
package homeworkweek3day1;

import java.util.Stack;


public class DecToBinary {
    
   static Stack<Integer> remainder = new Stack<Integer>();
    
    public static void convertBinary(int n){
        if(n == 0){
            while(!remainder.isEmpty()){
                System.out.print(remainder.pop());
            }
        } else {
            remainder.push(n%2);
            n = n/2;
            convertBinary(n);
        }
    }
    
    public static void main(String[] args){
        System.out.print("10: ");
        convertBinary(10);
        System.out.println();
        System.out.print("1: ");
        convertBinary(1);
        System.out.println();
        System.out.print("100: ");
        convertBinary(100);
    }
}

/*Output:
10: 1010
1: 1
100: 1100100
*/