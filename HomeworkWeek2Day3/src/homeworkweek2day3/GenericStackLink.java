
package homeworkweek2day3;


public class GenericStackLink<E> {
    
    public class Link{
        E data;
        Link last;
        Link next;
        
        public Link(E data){
            this.data = data;
        }
        
        public String toString(){
            return "" + data;
        }
    }
    
    private Link first;
    
    public GenericStackLink(){
        first = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    public void push(E value) {
        Link newLink = new Link(value);
        if (first == null) {
            first = newLink;
        } else {
            newLink.next = first;
            first = newLink;            
        }
    }
    
    public E pop(){
        Link temp = first;
        if(first == null){
            System.out.println("Can't delete, list empty");
            return null;
        } else {
            first = first.next;
            return temp.data;
        }
    }
    
    public void display(){
        Link current = first;
        while(current != null){
            System.out.println(current);
            current = current.next;
        }
    }
    
    public static void main(String[] args){
        GenericStackLink<Double> stl = new GenericStackLink<Double>();
        stl.push(33.4);
        stl.push(35.7);
        stl.push(36.9);
        stl.push(38.3);
        stl.display();
        System.out.println("Pop: " + stl.pop());
        System.out.println("Pop: " + stl.pop());
        stl.display();
        
    }
}

/*Output:
38.3
36.9
35.7
33.4
Pop: 38.3
Pop: 36.9
35.7
33.4
*/