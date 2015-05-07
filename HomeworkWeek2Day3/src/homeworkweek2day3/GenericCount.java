
package homeworkweek2day3;


public class GenericCount {
    
    public static <E> int countOccurrences(E[] array, E data){
        int count = 0;
        for(int i = 0; i< array.length; i++){
            if(array[i]. equals(data)){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        String[] text = new String[]{"CA", "US", "MX", "HN", "GT", "CA"};
        int count = countOccurrences(text, "CA");
        System.out.println("Number of counts of CA: " + count);
        
        Integer[] it = new Integer[]{10,20,30,10,40,10,60};
        int count1 = countOccurrences(it, 10);
        System.out.println("Number of counts of 10: " + count1);
    }
}

/*Output:
Number of counts of CA: 2
Number of counts of 10: 3
*/