
package homeworkweek3day2;


public class Vehicle implements Comparable{
    String name;
    double price;
    String model;

    public Vehicle(String name, double price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }
    
    public String toString(){
        return "\nname: " + name + ", \tmodel: " + model + ", \tprice: " + price;
    }

    @Override
    public int compareTo(Object o) {
        Vehicle v = (Vehicle) o;
        return Double.compare(this.price, v.price);
    }
}
