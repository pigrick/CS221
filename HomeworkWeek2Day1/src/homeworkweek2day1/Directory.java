
package homeworkweek2day1;


public class Directory {
    String name;
    long pno;
    Directory next;
    
    public Directory(String name, long pno){
        this.name = name;
        this.pno = pno;
    }
    
    public void displayDirectory(){
        System.out.println("Name: " + name + ", Phone: " + pno);
    }

    @Override
    public String toString() {
        return "Directory{" + "name=" + name + ", pno=" + pno + '}';
    }
    
    
}
