public class MultipleCatch {
    public static void main(String[] args) {
        int i= 2;
        int j= 8;
        int array[] = new int[5];
        try{
            int k = i/j;
            System.out.println(array[0]);
            System.out.println(array[5]);
        }
        catch(ArithmeticException e){

            System.out.println("you are trying to divide a number by zero" + " : " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This an array index error : " + e);
        }
        catch(Exception e){
            System.out.println("an error has occured");
        }
    }
}
