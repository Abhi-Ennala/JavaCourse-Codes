class CusExcep extends Exception{
    public CusExcep(String str){
   super(str);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int i =20;
        int j= 0;
        try{
            j= 18/i;
            if(j==0) {
                throw new CusExcep("CustomException successful");
            }
        }
        catch(CusExcep e){
            System.out.println("CustomException     error!");

        }
        catch(Exception e){
            System.out.println("Exception error");
        }
    }
}
