
package homeworkday2;


public class MyStringList {
    
    private final int INITIAL_LENGTH = 4;
    
    private int size = 0;    
    private String[] strArray;
    
    public MyStringList(){
        strArray = new String[INITIAL_LENGTH];
    }
    
    public void add(String s){
        if(strArray.length == size){
            resize();
        }
        strArray[size] = s;
        size++;
    }
    
    public String get(int i){
        return strArray[i];
    }
    
    public boolean find(String s){
        for(int i = 0; i < size; i++){
            if(s == strArray[i]){
                return true;
            }
        }
        return false;
    }
    
    public void insert(String s, int pos){
        if(size == strArray.length){
            resize();
        }
        String[] temp = new String[strArray.length];
        System.arraycopy(strArray, 0, temp, 0, pos);
        temp[pos] = s;        
        System.arraycopy(strArray, pos, temp, pos+1, size-pos);
        strArray = temp;
        size++;
    }
    
    public boolean remove(String s){
        int i;
        for(i = 0; i < size;i++){
            if(strArray[i].equals(s)){
                String[] temp = new String[strArray.length];
                System.arraycopy(strArray, 0, temp, 0, i);
                System.arraycopy(strArray, i+1, temp, i, size-i);
                strArray = temp;
                size--;
                return true;
            }
        }
        return false;
    }
    
    private void resize(){
        String[] temp = new String[(2*strArray.length)];
        System.arraycopy(strArray, 0, temp, 0, size);
        strArray = temp;        
    }
    
    public int size(){
        return size;
    }
    
    public void display(){
        for(int i = 0; i < size;i++){
            System.out.println(i + "|" + strArray[i]);
        }
    }
    
    public static void main(String[] args) {
        
        MyStringList obj = new MyStringList();
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Grape");
        obj.add("Melon");
        obj.insert("Watermelon", 4);
        obj.insert("Strawberry", 0);
        System.out.println("Removed Grape: " + obj.remove("Grape"));
        obj.display();
        
        System.out.println("The number of elements: " + obj.size());
        System.out.println("Position 1 is: " + obj.get(1));        
        
    }
    
}
