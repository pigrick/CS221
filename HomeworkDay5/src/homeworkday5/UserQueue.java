
package homeworkday5;


public class UserQueue {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    
    public UserQueue(int s){
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void insert(int j){
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = j;
    }
    
    public long remove() {
        int temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        return temp;
    }

    public long peek() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (rear + 1 == front || (front + maxSize - 1 == rear));
    }

    public boolean isFull() {
        return (rear + 2 == front || (front + maxSize - 2 == rear));
    }

}
