
package homeworkweek2day1;

public class DirectoryOpr {
    private Directory first;
    private Directory last;
    
    public DirectoryOpr(){
        first = null;
        last = null;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void insertFirst(String name, long pno){
        Directory newDirectory = new Directory(name, pno);
        
        if(isEmpty()){
            last = newDirectory;
        }
        newDirectory.next = first;
        first = newDirectory;
    }
    
    public void insertLast(String name, long pno){
        Directory newDirectory = new Directory(name, pno);
        if(isEmpty()){
            first = newDirectory;
        } else {
            last.next = newDirectory;
        }
        last = newDirectory;
    }
    
    public Directory deleteFirst(){
        Directory temp = first;
        if(first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }
    
    public int size(){
        int size = 0;
        Directory current = first;
        while(current != null){
            current = current.next;
            size++;
        }
        return size;
    }
    
    public void displayList(){
        Directory current = first;
        while(current != null){
            current.displayDirectory();
            current = current.next;
        }
    }
    
    public Directory find(String key){
        Directory current = first;
        while(current != null){
            if(current.name == key){
                return current;
            }
            current = current.next;
        }
        return null; 
    }
}
