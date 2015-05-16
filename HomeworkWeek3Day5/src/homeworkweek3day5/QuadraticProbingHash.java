
package homeworkweek3day5;

import java.util.Scanner;


public class QuadraticProbingHash {
    IntData[] hashtable;
    int arraySize;
    int size;
    IntData nonItem;
    
    public QuadraticProbingHash(int s){
        arraySize = s;
        hashtable =  new IntData[arraySize];
        size = 0;
        for(int i = 0; i< hashtable.length;i++){
            hashtable[i] = null;
        }
        nonItem = new IntData(-1);
    }
    
    public int hashFunc(int key){
        return key % arraySize;
    }
    
    
    public boolean insert(int s){
        if(size == arraySize){
            return false;
        }
        int hashValue = hashFunc(s);
        IntData newData = new IntData(s);
        int step = 1;
        
        while(hashtable[hashValue] != null &&
                   hashtable[hashValue].getKey() != -1){
            hashValue = hashFunc(s) + (step*step);
            hashValue %= arraySize;
            step++;
        }
        hashtable[hashValue] = newData;
        size++;
        return true;
    }
    
    public boolean delete(int s){
        int hashValue = hashFunc(s);
        int step = 1;
        
        while(hashtable[hashValue] != null){
            if(hashtable[hashValue].getKey() == s){
                hashtable[hashValue] = nonItem;
                size--;
                return true;
            }
            hashValue = hashFunc(s) + (step*step);
            hashValue %= arraySize;
            step++;
        }
        return false;
    }
    
    public boolean find(int s){
        int hashValue = hashFunc(s);
        int step = 1;
        
        while(hashtable[hashValue]!= null){
            if(hashtable[hashValue].getKey() == s){
                return true;
            }
            hashValue = hashFunc(s) + (step*step);
            hashValue %= arraySize;
            step++;
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
        QuadraticProbingHash qph = new QuadraticProbingHash(maxSize);  
        System.out.print("Enter initial size: ");
        int iSize = in2.nextInt();
        for(int i = 0; i < iSize;i++){
            int randomNum = (int) (Math.random()* 100);
            qph.insert(randomNum);
        }
        int input2;
        String input;      
        
        while(true){
            System.out.print("Enter the first letter of show, insert, delete and find: ");
            input = in.nextLine();
            
            switch(input){
                case "s":
                    qph.displayTable();
                    System.out.println("Size: " + qph.size);
                    break;
                case "i":
                    System.out.print("Enter a number to insert: ");
                    input2 = in2.nextInt();
                    System.out.println("Insert " + input2 + ": " + qph.insert(input2));
                    break;
                case "d":
                    System.out.print("Enter a number to insert: ");
                    input2 = in2.nextInt();
                    System.out.println("Delete " + input2 + ": " + qph.delete(input2));
                    break;
                case "f":
                    System.out.print("Enter a number to find: ");
                    input2 = in2.nextInt();
                    System.out.println("Find " + input2 + ": " + qph.find(input2));
                    break;
                default:
                    break;
            }
        }
    }
}

/*Output:
Enter the Hashtable max size: 13
Enter initial size: 0
Enter the first letter of show, insert, delete and find: i
Enter a number to insert: 13
Insert 13: true
Enter the first letter of show, insert, delete and find: i
Enter a number to insert: 13
Insert 13: true
Enter the first letter of show, insert, delete and find: i
Enter a number to insert: 13
Insert 13: true
Enter the first letter of show, insert, delete and find: i
Enter a number to insert: 13
Insert 13: true
Enter the first letter of show, insert, delete and find: s
Table: 
13 13 ** ** 13 ** ** ** ** 13 ** ** ** Size: 4



Enter the Hashtable max size: 13
Enter initial size: 5
Enter the first letter of show, insert, delete and find: i
Enter a number to insert: 88
Insert 88: true
Enter the first letter of show, insert, delete and find: s
Table: 
** ** 41 ** ** ** 84 ** 47 ** 88 88 51 Size: 6
Enter the first letter of show, insert, delete and find: d
Enter a number to insert: 88
Delete 88: true
Enter the first letter of show, insert, delete and find: s
Table: 
** ** 41 ** ** ** 84 ** 47 ** -1 88 51 Size: 5
Enter the first letter of show, insert, delete and find: d
Enter a number to insert: 88
Delete 88: true
Enter the first letter of show, insert, delete and find: s
Table: 
** ** 41 ** ** ** 84 ** 47 ** -1 -1 51 Size: 4
Enter the first letter of show, insert, delete and find: f
Enter a number to find: 84
Find 84: true
*/
