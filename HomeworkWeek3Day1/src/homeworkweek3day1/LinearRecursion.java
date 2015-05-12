
package homeworkweek3day1;


public class LinearRecursion {
    
    
    public static void main(String[] args) {
        int[] num = {12,34,45,22,3,1,4,555,6};
      
        System.out.println("34: " + linearSearch(num, 34,0));
        System.out.println("66: " + linearSearch(num, 66,0));
        
    }
    
    public static boolean linearSearch(int[] list, int data, int checkPos){
        if(checkPos == list.length){
            return false;
        } else {
            if(data == list[checkPos]){
                return true;
            } else {
                return linearSearch(list, data, checkPos +1);
            }
        }
    }
    
}

/*Output:
34: true
66: false
*/