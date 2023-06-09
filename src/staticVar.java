
 class Mobile{
    static String name; // used to denote all the objects have same values for variable name
    int price;
     String Bn;

     public void show(){
         System.out.println(Bn + ":" + price +":" + name);

     }
     public static void show1(Mobile obj){
         System.out.println(obj.Bn + ":" + obj.price +":" + name);
     }

}


public class staticVar {
    public static void main(String[] a) {

        Mobile m1 = new Mobile();
        m1.Bn = "samsung";
        m1.price = 12;
        Mobile.name = "smartphone";

        Mobile m2 = new Mobile();
        m2.Bn = "xiaomi";
        m2.price = 11;
//        Mobile.name = "smartphone"; NO need of instantiating again because the value will be same anyway for all objects

        Mobile.name = "phone";// change in one obj variable changes all other variable values
        //static keyword is used to represent class variables with a common value



        m1.show();
        m2.show();

        Mobile.show1(m2);
    }
}
