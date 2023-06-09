import java.util.Scanner;

enum Status{
    Running, Stopped, Failed, Error
}
public class Enum {
    public static void main(String[] args) {
//        Status[] s = Status.values();
//        for(Status ss : s) {
//            System.out.println(ss + ":" + ss.ordinal());
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the status");
        String str = sc.nextLine();
        Status s = Status.valueOf(str);


        switch (s){

            case Running:
                System.out.println("all good");
               break;
            case Stopped:
                System.out.println("Please try again");
                break;
            case Failed:
                System.out.println("Try again later");
                break;
            case Error:
                System.out.println("There's an error");
                break;
            default:

//        if(s == Status.Running){
//            System.out.println("all good");
//        }
//        else if(s == Status.Stopped){
//            System.out.println("Please try again");
//        }
//        else if(s == Status.Failed){
//            System.out.println("Try again later");
//        }else if(s == Status.Error){
//            System.out.println("Try again later");
//        }
//        else{
//            System.out.println("Done");
        }

    }
}
