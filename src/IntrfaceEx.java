abstract class Computer{
    abstract public void code();
}
class Desktop extends Computer{
    public void code(){
        System.out.println("coding faster");
    }
}
class Laptop extends Computer{
    public void code(){
        System.out.println("coding fast");
    }

}
class Developer{
    public void devApp(Computer lp){
        lp.code();
    }
}

public class IntrfaceEx {
    public static void main(String[] args) {

        Developer dev = new Developer();
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        dev.devApp(lap);
    }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*  interface Computer
  {
    void code();
  }

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }

}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, faster");
    }
}
class Developer
{
    //	public void devApp(Laptop lap)
    public void devApp(Computer lap)
    {
        lap.code();
    }
}

public class Demo {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();

        Computer lap=new Laptop();
        Computer desk=new Desktop();

        Developer navin=new Developer();
        navin.devApp(lap);

    }
    */
