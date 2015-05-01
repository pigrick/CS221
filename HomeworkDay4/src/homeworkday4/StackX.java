
package homeworkday4;


public class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top;
    
    public StackX(int s){
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j){
        if(top != maxSize-1){
            stackArray[++top] = j;
        } else {
            System.out.println("Can't push, it's full.");
        }
    }
    
    public long pop(){
        if(top != -1){
            return stackArray[top--];
        } else {
            System.out.println("Can't pop, it's empty.");
            return 0;
        }
    }
    
    public long peek(){
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return (top == - 1);
    }
    
    public boolean isFull(){
        return (top == maxSize-1);
    }    
        
    public int getSize(){
        return (top+1);
    }
    
    public boolean checkElement(long j){
        for(int i = 0; i <= top; i++){
            if(stackArray[i] == j){
                return true;
            }
        }
        return false;
    }
    
    public void display(){
        for(int i = 0; i <= top; i++){
            System.out.println(i + "|" + stackArray[i]);
        }
    }
    
    public void clear(){
        while(!this.isEmpty()){
            this.pop();
        }
    }
    
}
