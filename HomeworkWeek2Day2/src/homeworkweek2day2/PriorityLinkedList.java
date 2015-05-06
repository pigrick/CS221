
package homeworkweek2day2;


public class PriorityLinkedList {

    public class Link{
        int data;
        Link previous;
        Link next;
        
        public Link(int data){
            this.data = data;
        }
        
        public String toString(){
            return "" + data;
        }
    }
    
    Link first;
    
    public PriorityLinkedList(){
        first = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }
    
    public void displayList(){
        System.out.println("List (first-->last): ");
        Link current = first;
        while(current != null){
            System.out.println(current.toString());
            current = current.next;
        }
    }
    
    public int size(){
        int size = 0;
        Link current = first;
        while(current != null){
            size++;
            current = current.next;
        }
        return size;
    }
    
    public void insert(int data){
        Link current = first;
        Link previous = null;
        Link newLink = new Link(data);

        while (current != null && data > current.data) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = newLink;
        } else {
            previous.next = newLink;
        }
        newLink.next = current;

        
    }
    
    public static void main(String[] args) {
        PriorityLinkedList pll = new PriorityLinkedList();
        pll.insert(55);
        pll.insert(66);
        pll.insert(33);
        pll.insert(22);
        pll.insert(44);
        pll.displayList();
        System.out.println("Size: " + pll.size());
        pll.deleteFirst();
        pll.deleteFirst();
        pll.displayList();       
    }    
}

/*Output:
List (first-->last): 
22
33
44
55
66
Size: 5
List (first-->last): 
33
44
55
66
*/