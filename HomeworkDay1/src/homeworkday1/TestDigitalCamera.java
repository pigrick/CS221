
package homeworkday1;

import java.util.Scanner;

public class TestDigitalCamera {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        String[] brand = new String[4];
        int[] megapixels = new int[4];
        for(int i = 0; i < 4;i++){
            
        System.out.print("Type in camera " + (i+1) + " brand: ");
        brand[i] = in.nextLine();
        System.out.print("Type in camera " + (i+1) + " megapixels: ");
        megapixels[i] = in2.nextInt();        
        }
        DigitalCamera dg1= new DigitalCamera(brand[0], megapixels[0]);
        DigitalCamera dg2= new DigitalCamera(brand[1], megapixels[1]);
        DigitalCamera dg3= new DigitalCamera(brand[2], megapixels[2]);
        DigitalCamera dg4= new DigitalCamera(brand[3], megapixels[3]);
        
        System.out.println(dg1.toString());
        System.out.println(dg2.toString());
        System.out.println(dg3.toString());
        System.out.println(dg4.toString());
    }
}

/*Output:
Type in camera 1 brand: Canon
Type in camera 1 megapixels: 5
Type in camera 2 brand: Nikon
Type in camera 2 megapixels: 13
Type in camera 3 brand: Kodak
Type in camera 3 megapixels: 9
Type in camera 4 brand: Sony
Type in camera 4 megapixels: 3
brand = Canon, megaPixels = 5, price = 99.0
brand = Nikon, megaPixels = 10, price = 129.0
brand = Kodak, megaPixels = 9, price = 129.0
brand = Sony, megaPixels = 3, price = 99.0
*/