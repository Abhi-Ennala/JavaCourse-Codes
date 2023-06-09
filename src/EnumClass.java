//import java.util.Arrays;

enum Lappy {
//    Macbook(100000), Pavilion(58000), Surface(80000), Legion(60000);
Macbook(100000), Pavilion, Surface(80000), Legion(60000);
     private int price;
     Lappy(){
         price = 0;
     }

    Lappy(int price){
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
public class EnumClass {
    public static void main(String[] args) {





      Lappy lp = Lappy.Pavilion;
        System.out.println("the default price is:" + lp.getPrice());
      lp.setPrice(62000);
        System.out.println("this price has been changed to ::"+lp+ ":" +lp.getPrice());




//        System.out.println(Arrays.toString(Lappy.values()));
//      for(Lappy lap : Lappy.values()) {
//        System.out.println(lap + ":" + lap.getPrice());
//    }
    }
}



