import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String []args){
        System.out.println("Enter the number of kilometers you've ran today");
        Scanner sc = new Scanner(System.in);
       float km = sc.nextFloat();
       km *= 0.621371;
        System.out.println("The distance you've ran today in miles is:"+km);

    }
}
