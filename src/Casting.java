class C{

    public void show1(){
        System.out.println("inside C");
    }

}
class D extends C{

    public void show2(){
        System.out.println("inside D");
    }
}

public class Casting {

    public static void main(String[] args) {
       //C obj = new D();
       //obj.show2(); This cannot be done because Class C reference object doesn't know about the method show2() in class D

          C obj = (C) new D(); //THis is updcasting
           obj.show1();

        D obj1;
        obj1 = (D) obj; //This is downcasting
        obj1.show2();
        obj1.show1();

    }

}
