
package homeworkday3;

import java.util.ArrayList;

public class Library {
    
    private int bookID;
    private String ISBN;
    private String bookName;
    private double price;

    public Library(int bookID, String ISBN, String bookName, double price) {
        this.bookID = bookID;
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Library{" + "bookID=" + bookID + ", ISBN=" + ISBN + ", bookName=" + bookName + ", price=" + price + '}';
    }
    
    
    
    
    public static void main(String[] args){
        ArrayList<Library> library = new ArrayList<Library>();
        System.out.println("Is empty: " + library.isEmpty());
        library.add(new Library(5564, "ABNGGC", "Crazy Science", 88));
        library.add(new Library(3343, "SSBNDG", "Heaven Guidance", 50));
        library.add(new Library(3941, "CCNSLF", "MATH IS DANGEROUS", 140));
        for(int i = 0; i < library.size(); i++){
            System.out.println(library.get(i));
        }
        System.out.println("Library's size = " + library.size());
        library.remove(1);
        for(int i = 0; i < library.size(); i++){
            System.out.println(library.get(i));
        }
        System.out.println("Is empty: " + library.isEmpty());
    }
}

/*Output:
Is empty: true
Library{bookID=5564, ISBN=ABNGGC, bookName=Crazy Science, price=88.0}
Library{bookID=3343, ISBN=SSBNDG, bookName=Heaven Guidance, price=50.0}
Library{bookID=3941, ISBN=CCNSLF, bookName=MATH IS DANGEROUS, price=140.0}
Library's size = 3
Library{bookID=5564, ISBN=ABNGGC, bookName=Crazy Science, price=88.0}
Library{bookID=3941, ISBN=CCNSLF, bookName=MATH IS DANGEROUS, price=140.0}
Is empty: false
*/