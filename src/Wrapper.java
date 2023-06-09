public class Wrapper {

    public static void main(String[] args) {

        int num = 7;
//        Integer num1 = new Integer(num); Although this can be used but this method is not suggest as this can be discarded in the near future//        Integer num1 = num; // autoboxing.....cause' you're storing the primitive value in Integer class object
         Integer num1 = num;// autoboxing....as we are storing the primitive type value in Integer class object num1

        System.out.println(num1);

        int num2 = num1.intValue(); // auto-unboxing

        System.out.println(num2*2);
        String str ="12312";

        int num3 = Integer.parseInt(str); //Integer is wrapper class and parseInt is a method of that class

        System.out.println(num3*2);


    }
}
