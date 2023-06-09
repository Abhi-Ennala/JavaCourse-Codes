public class Exceptions {
    public static void main(String[] args) {
        int i= 0;
        int j= 0;
        try{
            int k = i/j;
        }
        catch(Exception e){
            System.out.println("you are trying to divide a number by zero" + " : " + e);
        }
    }
}
