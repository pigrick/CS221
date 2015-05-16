
package homeworkweek3day5;

import java.util.Scanner;


public class LinearProbingHash {
    
    StrData[] hashtable;
    int arraySize;
    int size;
    
    public LinearProbingHash(int s){
        arraySize = s;
        hashtable =  new StrData[arraySize];
        size = 0;
        for(int i = 0; i< hashtable.length;i++){
            hashtable[i] = null;
        }
    }
    
    public int hashFunc(String key){
        return key.hashCode() % arraySize;
    }
    
    
    public boolean insert(String s){
        if(size == arraySize){
            return false;
        }
        int hashValue = hashFunc(s);
        StrData newData = new StrData(s);
        
        while(hashtable[hashValue] != null){
            hashValue += 1;
            hashValue %= arraySize;
        }
        hashtable[hashValue] = newData;
        size++;
        return true;
    }
    
    public boolean delete(String s){
        int hashValue = hashFunc(s);
        
        while(hashtable[hashValue]!= null){
            if(hashtable[hashValue].getKey().equals(s)){
                hashtable[hashValue] = null;
                size--;
                return true;
            }
            hashValue += 1;
            hashValue %= arraySize;
        }
        return false;
    }
    
    public boolean find(String s){
        int hashValue = hashFunc(s);
        
        while(hashtable[hashValue]!= null){
            if(hashtable[hashValue].getKey().equals(s)){
                return true;
            }
            hashValue += 1;
            hashValue %= arraySize;
        }
        return false;
    }
    
    public void displayTable(){
        System.out.println("Table: ");
        for(int i = 0;i < hashtable.length; i++){
            if(hashtable[i] != null){
                System.out.print(hashtable[i].getKey() + " " );
            } else {
                System.out.print("** ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter the Hashtable max size: ");
        int maxSize = in2.nextInt();
        LinearProbingHash lph = new LinearProbingHash(maxSize);        
        
        while(true){
            System.out.print("Enter the first letter of show, insert, delete and find: ");
            String input = in.nextLine();
            switch(input){
                case "s":
                    lph.displayTable();
                    System.out.println("Size: " + lph.size);
                    break;
                case "i":
                    System.out.print("Enter a String to insert: ");
                    input = in.nextLine();
                    System.out.println("Insert " + input + ": " + lph.insert(input));
                    break;
                case "d":
                    System.out.print("Enter a String to insert: ");
                    input = in.nextLine();
                    System.out.println("Delete " + input + ": " + lph.delete(input));
                    break;
                case "f":
                    System.out.print("Enter a String to find: ");
                    input = in.nextLine();
                    System.out.println("Find " + input + ": " + lph.find(input));
                    break;
                default:
                    break;
            }
        }
    }
    
}

/*Output:
Enter the Hashtable max size: 11
Enter the first letter of show, insert, delete and find: s
Table: 
** ** ** ** ** ** ** ** ** ** ** Size: 0
Enter the first letter of show, insert, delete and find: i
Enter a String to insert: apple
Insert apple: true
Enter the first letter of show, insert, delete and find: i
Enter a String to insert: apple
Insert apple: true
Enter the first letter of show, insert, delete and find: i
Enter a String to insert: mango
Insert mango: true
Enter the first letter of show, insert, delete and find: i
Enter a String to insert: peach
Insert peach: true
Enter the first letter of show, insert, delete and find: s
Table: 
apple ** peach ** mango ** ** ** ** ** apple Size: 4
Enter the first letter of show, insert, delete and find: f
Enter a String to find: mango
Find mango: true
Enter the first letter of show, insert, delete and find: d
Enter a String to insert: peach
Delete peach: true
Enter the first letter of show, insert, delete and find: f
Enter a String to find: peach
Find peach: false
Enter the first letter of show, insert, delete and find: s
Table: 
apple ** ** ** mango ** ** ** ** ** apple Size: 3
*/