package inheritance;

class A{
    public void show(){
        System.out.println("inside A");
    }
}
class B extends A{
    public void show2(){
        System.out.println("inside B");
    }
}
class C extends A{
    public void show3(){
        System.out.println("inside C");
    }
}

class D{
    public void show(){
        System.out.println("inside D");
    }
}
public class DynamicDis {

    public static void main(String args[]){

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

       // obj = new D();  you cannot create an object of D using class A reference because it is not extending A

    }
}
