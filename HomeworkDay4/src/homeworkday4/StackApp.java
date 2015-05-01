/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkday4;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author yeerick
 */
public class StackApp {
    
    public static StackX merge(StackX st1, StackX st2){
        int size = (st1.getSize() + st2.getSize());
        StackX st3 = new StackX(size);
        while(!st1.isEmpty()){
            st3.push(st1.pop());
        }
        while(!st2.isEmpty()){
            st3.push(st2.pop());
        }
        return st3;
    }
    
    public static void main(String[] args){
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        String input;
        int maxSize;
        long values;
        System.out.print("Type in the size of your array: ");
        maxSize = in1.nextInt();
        StackX theStack = new StackX(maxSize);
        StackX preStack = new StackX(5);
        preStack.push(88);
        preStack.push(99);
        while(true){
            System.out.print("Instruction: ");
            input = in2.nextLine();
            if(input.equals("quit")){
                break;
            }
            switch(input){
                case "push" :
                    System.out.print("Values: ");
                    values = in3.nextLong();
                    theStack.push(values);
                    break;
                case "peek" :
                    System.out.println(theStack.peek());
                    break;
                case "pop" :
                    System.out.println(theStack.pop());
                    break;
                case "empty" :
                    System.out.println("Empty :" + theStack.isEmpty());
                    break;
                case "full" :
                    System.out.println("Full :" + theStack.isFull());
                    break;
                case "size" :
                    System.out.println("Size : " + theStack.getSize());
                    break;
                case "check" :
                    System.out.println("Values: ");
                    values = in3.nextLong();
                    System.out.println(theStack.checkElement(values));
                    break;
                case "display" :
                    theStack.display();
                    break;
                case "clear" :
                    theStack.clear();
                    break;
                case "merge" :
                    theStack = merge(theStack, preStack);
                    break;
                default :
                    break;                    
            }
            
            
        }
        
    }
}

/*Output:
Type in the size of your array: 3
Instruction: empty
Empty :true
Instruction: push
Values: 33
Instruction: push
Values: 44
Instruction: push
Values: 55
Instruction: push
Values: 66
Can't push, it's full.
Instruction: full
Full :true
Instruction: size
Size : 3
Instruction: display
0|33
1|44
2|55
Instruction: pop
55
Instruction: merge
Instruction: display
0|44
1|33
2|99
3|88
Instruction: check
Values: 
99
true
Instruction: check
Values: 
34
false
Instruction: clear
Instruction: empty
Empty :true
Instruction: quit
*/