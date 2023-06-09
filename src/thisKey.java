class thisK{
    private int age;
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age; /*Here this keyword refers to the current object that is calling the method.
         For example here object "ex" is calling the method so this keyword represents that object*/
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class thisKey {
    public static void main(String args[]){

        thisK ex = new thisK();

        ex.setName("Abhi");
        ex.setAge(20);

        System.out.println(ex.getAge() +":" +ex.getName());
    }
}
