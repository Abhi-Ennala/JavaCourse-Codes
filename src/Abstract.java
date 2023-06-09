abstract class car{ //for an abstract method to exist in a class, the class also should be abstract
//   public void drive(){
//   } when you are not implementing the method you can use abstract keyword to define the method

    abstract public void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("playing music....");
    }
}
/*If you can't implement the abstract method after extending, the subclass also becomes abstract class

abstract wagonR extends car{
    abstract public void show();
     public void drive(){
        System.out.println("driving....");
    }
    }
 */
abstract class wagonR extends car{ //when you are extending the abstract class it is compulsory to implement the abstract method from the parent class

    public void drive(){
        System.out.println("driving....");
    }


}
class updatedWagonR extends wagonR{ //this is a concrete class
    public void fly(){
        System.out.println("flying...");
    }
}



public class Abstract {

    public static void main(String[] args) {
      // car obj = new car()   you cannot create object of an abstract class
       car obj = new updatedWagonR();// but you can create reference of an object class
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
