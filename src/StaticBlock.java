class ex{

    static String name; // used to denote all the objects have same values for variable name
    int price;
    String Bn;

    public ex(){
         price = 11;
         Bn = "samsung";

        System.out.println("inside the constructor");
    }
    static{
        name = "smartphone";
        System.out.println("inside the static block");
    }


}
public class StaticBlock {

    public static void main(String args[]){

        ex m1 = new ex();

        ex m2 = new ex();



    }
}
