
package homeworkweek2day3;


public class GenericQueue<E> {
    private int maxSize;
    private E[] queArray;
    int front;
    int rear;
    
    public GenericQueue(int s){
        maxSize = s;
        queArray = (E[]) new Object[maxSize];
        front = 0;
        rear = -1;
    }
    
    public void insert(E e){
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = e;
    }
    
    public E remove() {
        E temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        return temp;
    }
    
    public E peek() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (rear + 1 == front || (front + maxSize - 1 == rear));
    }

    public boolean isFull() {
        return (rear + 2 == front || (front + maxSize - 2 == rear));
    }
    
    public static void main(String[] args) {
        GenericQueue<String> gq = new GenericQueue<String>(5);
        gq.insert("Banana");
        gq.insert("Watermelon");
        gq.insert("Grape");
        gq.insert("Apple");
        System.out.println("Peek: " + gq.peek());
        System.out.println("Pop: " + gq.remove());
        System.out.println("Pop: " + gq.remove());
        System.out.println("Pop: " + gq.remove());
        System.out.println("Pop: " + gq.remove());
        System.out.println("Empty: " + gq.isEmpty());
    }
    
}

/*Output:
Peek: Banana
Pop: Banana
Pop: Watermelon
Pop: Grape
Pop: Apple
Empty: true
*/