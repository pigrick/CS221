
package homeworkweek2day1;


public class LinkList {
        private Link first;
        
    public LinkList(){
        first = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void insertFirst(int id , double dd){
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first = newLink;
    }
    
    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }
    
    public void displayList(){
        System.out.print("List (first-->last): ");
        Link current = first;
        while(current != null){
            current.displayLink();;
            current = current.next;
        }
    }
    
    public int size(){
        int size = 0;
        Link current = first;
        while(current != null){
            current = current.next;
            size++;            
        }
        return size;
    }
    
    public Link findGreatestInt(){
        Link current = first.next;
        Link greatest = first;
        while(current != null){
            if(current.iData > greatest.iData){
                greatest = current;
            }
            current = current.next;
        }
        return greatest;
    }
    
    public Link findSmallestInt(){
        Link current = first.next;
        Link smallest = first;
        while(current != null){
            if(current.iData < smallest.iData){
                smallest = current;
            }
            current = current.next;
        }
        return smallest;
    }

    public boolean find(int key){
        Link current = first;
        while(current != null){
            if(current.iData == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        LinkList num = new LinkList();
        num.insertFirst(33, 3.33);
        num.insertFirst(44, 4.44);
        num.insertFirst(55, 5.55);
        num.insertFirst(22, 2.22);
        num.displayList();
        System.out.println();
        System.out.println("Greatest Integer: " + num.findGreatestInt());
        System.out.println("Smallest Integer: " + num.findSmallestInt());
        System.out.println("Size: " + num.size());
        System.out.println("55?: " +num.find(55));
        System.out.println("66?: " + num.find(66));
    }
    
}

/*Output:
List (first-->last): {22, 2.22} {55, 5.55} {44, 4.44} {33, 3.33} 
Greatest Integer: Link{iData=55, dData=5.55}
Smallest Integer: Link{iData=22, dData=2.22}
Size: 4
55?: true
66?: false
*/