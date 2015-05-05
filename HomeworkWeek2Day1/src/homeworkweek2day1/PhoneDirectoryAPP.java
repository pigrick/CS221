/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkweek2day1;


public class PhoneDirectoryAPP {
    
    public static void main(String[] args){
        DirectoryOpr pD = new DirectoryOpr();
        pD.insertFirst("Tedd", 23534344);
        pD.insertFirst("Amy", 78734342);
        pD.insertLast("Renold", 128834342);
        pD.insertLast("Gaby", 323484342);
        pD.displayList();
        System.out.println("Size: " + pD.size());
        System.out.println(pD.find("Renold"));
        System.out.println("Delete first: " + pD.deleteFirst());
        
    }
}

/*Output:
Name: Amy, Phone: 78734342
Name: Tedd, Phone: 23534344
Name: Renold, Phone: 128834342
Name: Gaby, Phone: 323484342
Size: 4
Directory{name=Renold, pno=128834342}
Delete first: Directory{name=Amy, pno=78734342}
*/