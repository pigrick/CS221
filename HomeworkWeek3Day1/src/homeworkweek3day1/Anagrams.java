
package homeworkweek3day1;

import java.util.Arrays;


public class Anagrams {
    
    public static void main(String[] args){
        System.out.println("cat & tac: " + isAnagrams("cat", "tac"));
        System.out.println("apple & plepa: " + isAnagrams("apple", "plepa"));
        System.out.println("cicks & micks: " + isAnagrams("cicks", "micks"));
    }
    
    public static boolean isAnagrams(String a, String b){
        char[] aa = new char[a.length()];
        char[] bb = new char[b.length()];
        for(int i = 0; i<aa.length;i++){
            aa[i] = a.charAt(i);
        }
        for(int i = 0; i<bb.length;i++){
            bb[i] = b.charAt(i);
        }
        
        Arrays.sort(aa);
        Arrays.sort(bb);
        if(Arrays.equals(aa, bb)){
            return true;
        } else {
            return false;
        }
    }
}

/*Output:
cat & tac: true
apple & plepa: true
cicks & micks: false
*/