
package homeworkweek3day2;
import java.util.TreeSet;

public class VehicleTest {
    
    public static void main(String[] args){
        TreeSet<Vehicle> v = new TreeSet<Vehicle>();
        v.add(new Vehicle("BMW" , 80000, "G35" ));  
        v.add(new Vehicle("Toyota" , 20000, "V33" ));
        v.add(new Vehicle("Honda" , 25000, "P23" ));
        v.add(new Vehicle("Benz" , 110000, "D87" ));
        v.add(new Vehicle("Suzuki" , 30000, "C11" ));
        v.add(new Vehicle("Peugeot" , 240000, "K99" ));              
        v.add(new Vehicle("Ferarri" , 200000, "R18" ));
        
        System.out.println(v);
    }
}

/*Output:
name: Toyota, 	model: V33, 	price: 20000.0, 
name: Honda, 	model: P23, 	price: 25000.0, 
name: Suzuki, 	model: C11, 	price: 30000.0, 
name: BMW, 	model: G35, 	price: 80000.0, 
name: Benz, 	model: D87, 	price: 110000.0, 
name: Ferarri, 	model: R18, 	price: 200000.0, 
name: Peugeot, 	model: K99, 	price: 240000.0]
*/