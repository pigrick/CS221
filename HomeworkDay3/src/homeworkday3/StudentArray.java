/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkday3;

/**
 *
 * @author yeerick
 */
public class StudentArray {
    private Student[] a;
    private int nElems = 0;
    
    public StudentArray(int max){
        a = new Student[max];
    }
    
    public void insert(int id, String name, int mark){
        for(int i = 0; i<nElems;i++){
            if(a[i].getId() == id){
                return;
            }
        }
        a[nElems] = new Student(id, name, mark);
        nElems++;
    }
    
    public boolean delete(int id){
        for (int i = 0; i < nElems; i++) {
            if (a[i].getId() == id) {
                for (int j = i; j < nElems; j++) {
                    a[j] = a[j + 1];

                }
                nElems--;
                return true;
            }
        }
        return false;
    }
    
    public void displayAll(){
        for(int i = 0; i < nElems; i++){
            a[i].displayStudent();
        }
    }
    
    public void maxMark(){
        Student highest;
        highest = a[0];
        for(int i = 1; i < nElems;i++){
            if(highest.getMark() < a[i].getMark()){
                highest = a[i];
            }
        }
        highest.displayStudent();
    }
    
    public void minMark(){
        Student lowest;
        lowest = a[0];
        for(int i = 1; i < nElems;i++){
            if(lowest.getMark() > a[i].getMark()){
                lowest = a[i];
            }
        }
        lowest.displayStudent();
    }
    
    public static void main(String[] args){
        StudentArray sa = new StudentArray(20);
        sa.insert(1111, "Kevin", 77);
        sa.insert(2222, "Emily", 67);
        sa.insert(3333, "Samuel", 88);
        sa.insert(1111, "James", 96);
        sa.insert(4444, "Maharindu", 44);
        sa.insert(5555, "Jagadi", 54);
        sa.displayAll();
        System.out.println("Delete ID = 2222: " + sa.delete(2222)) ;
        System.out.println("Delete ID = 3434: " + sa.delete(3434)) ;
        sa.displayAll();
        System.out.print("Maximum mark student is ");
        sa.maxMark();
        System.out.print("Minimum mark student is ");
        sa.minMark();
    }
    
}

/*Output:
Student Id = 1111, name = Kevin, mark = 77
Student Id = 2222, name = Emily, mark = 67
Student Id = 3333, name = Samuel, mark = 88
Student Id = 4444, name = Maharindu, mark = 44
Student Id = 5555, name = Jagadi, mark = 54
Delete ID = 2222: true
Delete ID = 3434: false
Student Id = 1111, name = Kevin, mark = 77
Student Id = 3333, name = Samuel, mark = 88
Student Id = 4444, name = Maharindu, mark = 44
Student Id = 5555, name = Jagadi, mark = 54
Maximum mark student is Student Id = 3333, name = Samuel, mark = 88
Minimum mark student is Student Id = 4444, name = Maharindu, mark = 44
*/
