import org.w3c.dom.ls.LSOutput;

class Outer{
    public void show(){
        System.out.println("inside A");
    }
   static  class Inner{
        public void config(){
            System.out.println("inside inner class");
        }

    }
}
public class InnerClass {
    public static void main(String[] args) {
      Outer obj = new Outer();
      obj.show();

      Outer.Inner obj1 = new Outer.Inner();// to create the object of inner class, we need the object of the outer class
        obj1.config();
    }
}
