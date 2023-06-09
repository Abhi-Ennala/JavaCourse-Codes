
class alien{
    String name;
    String type;
    int number;
    public alien(){
        name = "wauh";
        type = "pk";
        number = 8;
    }
    public alien(String name, String type, int number){
        this.name = name;
        this.type = type;
        this.number = number;
    }
}
public class constructor {
    public static void main(String args[])
    {

        alien al = new alien();
        System.out.println(al.name + "," + al.type + ","+ al.number);

        alien al1 = new alien("cian", "gk", 18);
    }
}
