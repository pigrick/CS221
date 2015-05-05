
package homeworkweek2day1;


public class Link {
    public int iData;
    public double dData;
    public Link next; 
     
    public Link(int id, double dd) {
        iData = id;
        dData = dd;
    }
    
    public void displayLink(){
        System.out.print("{" + iData + ", " + dData + "} ");
    }

    @Override
    public String toString() {
        return "Link{" + "iData=" + iData + ", dData=" + dData + '}';
    }
    
    
}
