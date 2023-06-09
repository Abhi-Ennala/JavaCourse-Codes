interface X{
//    void  show();
//    void show(int i);
    int add(int i,int j);
}

public class Lambda {
    public static void main(String[] args) {
//        X obj = () -> System.out.println("inside anonymous class");
//         obj.show();
//        X obj = i -> System.out.println(i);// when you have only one variable(parameter) you can write only the variable
//        obj.show(9);

      X obj = (i,j) -> i+j;
      int result = obj.add(12,52);
        System.out.println(result);

    }
}
