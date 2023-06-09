import java.util.Scanner;
public class  CalculatePercentage {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of subject1:");
        int sub1= sc.nextInt();
        System.out.println("enter marks of subject2:");
        int sub2= sc.nextInt();
        System.out.println("enter marks of subject3:");
        int sub3= sc.nextInt();
        System.out.println("enter marks of subject4:");
        int sub4= sc.nextInt();
        System.out.println("enter marks of subject5:");
        int sub5= sc.nextInt();


        float avg = (float)(sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println(avg);
    }
}
