public class Throw {
    public static void main(String[] args)  {
        int i= 2;
        int j= 0;

        try{
            j=  18/i;
             throw new ArithmeticException("this msg is passed through the object");

        }

        catch(ArithmeticException e){

            System.out.println("you are trying to divide a number by zero" + " : " + e);
        }

        catch(Exception e){
            System.out.println("an error has occured");
        }

    }

}
