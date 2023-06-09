interface Example{ // Interface is basically used for creating abstract methods which can be implemented later in a different class

     int age = 21;
     String name = "Abhi";// By default variables created in interfaces are STATIC and FINAL
    void show();
    void config();
}

class Ex implements Example{


    public void show() {
        System.out.println("inside show");
    }


    public void config() {
        System.out.println("inside config");
    }
}
public class Interface {
    public static void main(String[] args) {
        Example ex = new Ex();
        ex.config();
        ex.show();

//        Example.age = 22; you cannot change the value of the variable
        System.out.println(Example.age);/* As these are static variables you can directly use Interface name
        instead of an object to work with it*/

        System.out.println(Example.name);
    }
}
