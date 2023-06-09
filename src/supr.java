class A{
    public A(){
        super();
        System.out.println("inside A");
    }

    public A(int n){
        super();
        System.out.println("inside int A");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("inside B");

    }
    public B(int n){
        this();
        System.out.println("inside int B");
    }
}
public class supr {
    public static void main(String args[]){
        B b = new B(9);
    }
}
