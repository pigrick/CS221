
package homeworkday5;


public class RevisedPriorityQ {

    private int maxSize;
    private long[] queArray;
    private int nItems;
    
    public RevisedPriorityQ(int s){
        maxSize = s;
        queArray = new long[s];
        nItems = 0;
    }
    
    public void insert(long item){
        if(nItems == maxSize){
            System.out.println("It's full, cant' insert!");
        } else {
            queArray[nItems++] = item;
        }
    }
    
    public long remove(){
        if(nItems == 0){
            System.out.println("It's empty, can't delete!");
            return -1;
        }
        long smallest = queArray[0];
        int j = 0;
        int i;
        long[] temp = new long[maxSize];
        for(i = 1; i < nItems;i++){
            if(smallest > queArray[i]){
                smallest = queArray[i];
                j = i;
            }
        }
        for(i = j; i < nItems-1;i++){
            queArray[i] = queArray[i+1];
        }
        nItems--;
        return smallest;
    }
    
    public void display(){
        for(int i = 0;i<nItems;i++){
            System.out.println(i + "|" + queArray[i]);
        }
    }
    
    public static void main(String[] args) {
        RevisedPriorityQ rp = new RevisedPriorityQ(4);
        rp.insert(44);
        rp.insert(33);
        rp.insert(22);
        rp.insert(77);
        rp.insert(100);
        System.out.println("Removed: " + rp.remove());
        System.out.println("Removed: " + rp.remove());
        System.out.println("Removed: " + rp.remove());
        System.out.println("Removed: " + rp.remove());
        System.out.println("Removed: " + rp.remove());
        
    }
    
}

/*Output:
It's full, cant' insert!
Removed: 22
Removed: 33
Removed: 44
Removed: 77
It's empty, can't delete!
Removed: -1
*/