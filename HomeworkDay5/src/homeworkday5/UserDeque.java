
package homeworkday5;


public class UserDeque {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    
    public UserDeque(int s){
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void insertLeft(int j){
        if (rear != maxSize) {
            if (front == 0) {
                for (int i = rear; i >= 0; i--) {
                    queArray[i + 1] = queArray[i];
                    
                }
                rear++;
                queArray[front] = j;
            }
        } else {
        
            queArray[front] = j;
        }
    }
    
    public void insertRight(int j){
        if (rear == maxSize - 1) {
            System.out.println("It's full, can't insert!");
        } else {
            queArray[++rear] = j;
        }
    }
    
    public long removeLeft() {
        int temp = queArray[front++];
        if (front > rear) {
            System.out.println("It's empty, can't remove");
            return -1;
        }
        return temp;
    }
    
    public long removeRight() {
        int temp = queArray[rear--];
        if (front > rear) {
            System.out.println("It's empty, can't remove");
            return -1;
        }
        return temp;
    }


    public boolean isEmpty() {
        return (front > rear);
    }

    public boolean isFull() {
        
        return (front == 0 && rear == maxSize-1);
    }
    
    public void display(){
        for(int i = front; i< rear+1;i++){
            System.out.println(queArray[i]);
        }
    }
    
    public static void main(String[] args){
        UserDeque num = new UserDeque(5);
        System.out.println("Empty: " + num.isEmpty());
        System.out.println("Full: " + num.isFull());
        num.insertLeft(5);
        num.insertRight(6);
        num.insertLeft(3);
        num.insertRight(7);
        num.insertRight(8);
        num.display();
        System.out.println("Empty: " + num.isEmpty());
        System.out.println("Full: " + num.isFull());
        System.out.println("Left Removed: " + num.removeLeft());
        System.out.println("Right Removed: " + num.removeRight());
        System.out.println("Left Removed: " + num.removeLeft());
        num.display();
    }
}

/*Output:
Empty: true
Full: false
3
5
6
7
8
Empty: false
Full: true
Left Removed: 3
Right Removed: 8
Left Removed: 5
6
7
*/
