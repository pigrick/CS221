
package homeworkweek2day3;


public class GenericDoubleEndedLink<E> {
    
    public class Node{
        E value;
        Node next;
        Node previous;
        
        public Node(Node previous, E value, Node next){
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
        
        public String toString(){
            return "" + value;
        }
        
    }
    
    Node header;
    
    
    public GenericDoubleEndedLink(){
        header = null;
    }
    
    public boolean isEmpty(){
        return (header == null);
    }
    
    public void addFront(E value) {
        if (header == null) {
            header = new Node(null, value, null);
        } else {
            Node n = new Node(null, value, header);
            header.previous = n;
            header = n;
        }
    }

    public void addLast(E value) {
        if (header == null) {
            header = new Node(null, value, null);
        } else {

            Node last = findLast();
            last.next = new Node(last, value, null);
        }
    }
    
    public Node findLast() {
        if (header == null) {
            return null;
        } else {
            Node temp = header;
            while (temp.next != null) {
                temp = temp.next;
            }
            return temp;
        }
    }
    
    public void deleteFront(){
        if(header == null){
            System.out.println("Can't delete, List is full");
        } else if (header.next == null && header.previous == null){
            header = null;
        } else {
            header.next.previous = null;
            header = header.next;
        }
    }
    
    public void deleteLast(){
        if(header == null){
            System.out.println("Can't delete, List is full");
        } else if (header.next == null && header.previous == null){
            header = null;
        } else {
            Node last = findLast();
            last.previous.next = null;
        }
    }
    
    public void display(){
        Node current = header;
        while(current!= null){
            System.out.println(current);
            current = current.next;
        }
    }
    
    public static void main(String[] args){
        GenericDoubleEndedLink<Integer> gdel = new GenericDoubleEndedLink<Integer>();
        gdel.addFront(33);
        gdel.addLast(66);
        gdel.addFront(55);
        gdel.addLast(77);
        gdel.display();
        System.out.println("Last: " + gdel.findLast());
        gdel.deleteLast();
        gdel.deleteFront();
        gdel.display();
    }
    
}
/*Output:
55
33
66
77
Last: 77
33
66
*/