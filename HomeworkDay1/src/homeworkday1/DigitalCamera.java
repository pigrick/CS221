
package homeworkday1;

public class DigitalCamera {

    private String brand;
    private int megaPixels;
    private double price;

    public DigitalCamera(String brand, int megaPixels) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        if (megaPixels > 10) {
            this.megaPixels = 10;
        }
        if (this.megaPixels <= 6) {
            this.price = 99;
        } else {
            this.price = 129;
        }
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand = " + brand + ", megaPixels = " + megaPixels + ", price = " + price;
    }

}
