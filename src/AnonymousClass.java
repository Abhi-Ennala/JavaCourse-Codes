abstract class Bike{

   abstract public void rides();

}
public class AnonymousClass {
    public static void main(String[] args) {
        Bike obj = new Bike(){
            public void rides(){
                System.out.println("riding....");
            }
        };
        obj.rides();
    }

}
