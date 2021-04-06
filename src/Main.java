
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class Main {
    public static void main(String args[]){
           try{
               CPU cpu1 = new CPU(2, 3);
               CPU cpu2 = new CPU(4,2.9);
               CPU cpu3 = new CPU(4,3.7);
               CPU cpu4 = new CPU(6,4);
               CPU cpu5 = new CPU(8,4.7);
               Laptop l1 = new Laptop(700,"Lenovo",cpu2);
               Laptop l2 = new Laptop(3000,"Dell",cpu1);
               Laptop l3 = new Laptop(1000,"HP",cpu3);
               Laptop l4 = new Laptop(1300,"Acer",cpu4);
               Laptop l5 = new Laptop(1500,"Msi",cpu5);
               Laptop l6 = new Laptop(2000,"Apple",cpu4);
 
               ArrayList<Laptop> list = new ArrayList<>();
               list.add(l1);
               list.add(l2);
               list.add(l3);
               list.add(l4);
               list.add(l5);
               list.add(l6);
 
               System.out.println(list);
               Collections.sort(list);
               System.out.println(list);
           }
           catch (LaptopExe e){
               System.out.println(e.getMessage());
           }
    }
}