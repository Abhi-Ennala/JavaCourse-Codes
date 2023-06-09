
class eg{
   private int age;
    private String name;

    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class encapsulation {
     public static void main(String args[]){

         eg ex = new eg();

         ex.setName("abhi");
         ex.setAge(20);

         System.out.println(ex.getAge() +":" +ex.getName());
     }
}
