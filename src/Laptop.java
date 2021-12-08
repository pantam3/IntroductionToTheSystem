
public class Laptop implements Comparable <Laptop> {
    private int price;
    private String brand;
    private CPU cpu;
 
    public int getPrice() {
        return price;
    }
 //comment
    public void setPrice(int price) throws LaptopExe {
        if (price < 0) {
            throw new LaptopExe("Invalid price!");
        } else {
            this.price = price;
        }
    }
 
    public String getBrand() {
        return brand;
    }
 
    public void setBrand(String brand) {
        this.brand = brand;
    }
 
    public CPU getCpu() {
        return cpu;
    }
 
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
 
    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", cpu=" + cpu +
                '}';
    }
 
    public Laptop(int price, String brand, CPU cpu) throws LaptopExe {
        this.setPrice(price);
        this.setBrand(brand);
        this.setCpu(cpu);
 
    }
 
    public int compareTo(Laptop o) {
            return o.getCpu().getCores() - this.getCpu().getCores();
        }
}