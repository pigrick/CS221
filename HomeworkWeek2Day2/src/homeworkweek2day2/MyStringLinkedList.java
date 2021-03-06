
package homeworkweek2day2;


public class MyStringLinkedList {
    
    public class Node{
        String value;
        Node next;
        Node previous;
        
        public Node(String value){
            this.value = value;
        }
        
        public String toString(){
            return value;
        }
        
    }
    
    Node first;
    Node last;
    
    public MyStringLinkedList(){
        first = null;
        last = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void addFront(String value){
        Node newNode = new Node(value);
        if(isEmpty()){
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first.previous = newNode;
            first = newNode;
        }
    }
    
    public void addLast(String value){
        Node newNode = new Node(value);
        if(isEmpty()){
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
    }
    
    public void postAddNode(Node n, String value){
        Node newNode = new Node(value);
        Node current = first;
        if(n.equals(last)){
            this.addLast(value);
        } else {           
            while(current != null){
            
                if(current.equals(n)){
                    newNode.previous = current;
                    newNode.next = current.next;
                    current.next = newNode;
                    newNode.next.previous = newNode;
                    break;
                }
                current = current.next;
            }
            if(current == null){
                System.out.println("Can't find " + n + " in the list, can't insert!");
            }
        }
    }
    
    public void preAddNode(Node n, String value){
        Node newNode = new Node(value);
        Node current = first;
        if(n.equals(first)){
            this.addFront(value);
        } else {           
            while(current != null){
            
                if(current.equals(n)){
                    newNode.previous = current.previous;
                    newNode.next = current;
                    current.previous = newNode;
                    newNode.previous.next = newNode;
                    break;
                }
                current = current.next;
            }
            if(current == null){
                System.out.println("Can't find " + n + " in the list, can't insert!");
            }
        }
    }
    
    public int size(){
        int size = 0;
        Node current = first;
        while(current != null){
            size++;
            current = current.next;
        }
        return size;
    }
    
    public Node findLast(){
        return last;
    }
    
    public Node findItem(String str){
        Node current = first;
        while(current != null){
            if(current.value.equals(str)){
                return current;
            }
            current = current.next;
        }
        return null;
    }
    
    public void deleteNode(Node n){
        
        Node current = first;
        if(n.equals(first)){
            current.next.previous = null;
            first = current.next;
        } else if (n.equals(last)){
            last.previous.next = null;
            last = last.previous;
        } else {
            while (current != null) {
                if (current.equals(n)) {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
            }
        }
    }
    
    public void deleteList(){
        first = null;
        last = null;
    }
    
    public void printReverse(){
        Node current = last;
        while(current != null){
            System.out.println(current);
            current = current.previous;
        }
    }
    
    public void printForward(){
        Node current = first;
        while(current!= null){
            System.out.println(current);
            current = current.next;
        }
    }
    
    public static void main(String[] args){
        MyStringLinkedList msll = new MyStringLinkedList();
        msll.addFront("Max");
        msll.addFront("James");
        msll.addLast("Emily");
        msll.addLast("Anthony");
        System.out.println("Forward Print:");
        msll.printForward();
        System.out.println("Reversed Print:");
        msll.printReverse();
        System.out.println("Find Emily: " + msll.findItem("Emily"));
        System.out.println("Find Albert: " + msll.findItem("Albert"));
        System.out.println("Find last: " + msll.findLast());
        System.out.println("Size: " + msll.size());
        msll.preAddNode(msll.findItem("Anthony"), "Alex");
        msll.postAddNode(msll.findItem("James"), "Nickson");
        msll.printForward();
        msll.deleteNode(msll.findItem("James"));
        msll.deleteNode(msll.findItem("Anthony"));
        System.out.println("---------");
        msll.printForward();
        
    }
}



/*Output:
Forward Print:
James
Max
Emily
Anthony
Reversed Print:
Anthony
Emily
Max
James
Find Emily: Emily
Find Albert: null
Find last: Anthony
Size: 4
James
Nickson
Max
Emily
Alex
Anthony
---------
Nickson
Max
Emily
Alex
*/