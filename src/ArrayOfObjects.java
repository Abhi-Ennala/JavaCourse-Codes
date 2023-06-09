class Student{
    String name;
    int rollno;

}
public class ArrayOfObjects {
    public static void main(String[] args){

//        int nums[] = new int [5];

        Student a1 = new Student();
        a1.name="abhi";
        a1.rollno=26;

        Student a2 = new Student();
        a2.name="nav";
        a2.rollno=26;

        Student students[] = new Student[5];
        students[0]=a1;
        students[1]=a2;
        for(Student stud : students)
        {
            System.out.println(stud.name + " : " + stud.rollno);
        }

    }
}
