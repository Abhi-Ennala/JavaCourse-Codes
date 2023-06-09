class Y{
    public void show() throws ClassNotFoundException{
        Class.forName("Demo");
    }
}
public class Throws {
    public static void main(String[] args) {

        Y obj = new Y();
        try{

            obj.show();
        }
        catch(ClassNotFoundException e){
            System.out.println("the class you are searching for is nowhere to be found:"+e);
        }
    }
}
