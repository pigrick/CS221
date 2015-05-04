
package homeworkday5;
import java.util.LinkedList;
import java.util.Queue;

public class Admission {
    static int autoGenerate = 1000;
    int adno;
    String name;
    String pno;

    public Admission(String name, String pno) {
        adno = autoGenerate++;
        this.name = name;
        this.pno = pno;
    }

    @Override
    public String toString() {
        return "Admission number = " + adno + ", Name = "
                + name + ", Phone NO =" + pno + '}';
    }
    
    
    
    public static void main(String[] args){
        Queue<Admission> admission = new LinkedList<Admission>();
        admission.add(new Admission("James", "(205)116-4488"));
        admission.add(new Admission("Emily", "(225)126-3348"));
        admission.add(new Admission("Alex", "(115)134-4008"));
        admission.add(new Admission("Wang", "(555)226-4333"));
        admission.add(new Admission("Jeffrey", "(266)177-4995"));
        System.out.println("Peek: " + admission.peek());
        System.out.println("Size: " + admission.size());
        while(!admission.isEmpty()){
            System.out.println(admission.remove());
        }
        System.out.println("Empty? : " + admission.isEmpty());
        
    }
}

/*Output:
Peek: Admission number = 1000, Name = James, Phone NO =(205)116-4488}
Size: 5
Admission number = 1000, Name = James, Phone NO =(205)116-4488}
Admission number = 1001, Name = Emily, Phone NO =(225)126-3348}
Admission number = 1002, Name = Alex, Phone NO =(115)134-4008}
Admission number = 1003, Name = Wang, Phone NO =(555)226-4333}
Admission number = 1004, Name = Jeffrey, Phone NO =(266)177-4995}
Empty? : true
*/