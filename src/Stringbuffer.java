public class Stringbuffer {

        public static void main(String args[]){
            StringBuffer sb =  new StringBuffer("abhi");
            System.out.println(sb);
            sb.append("nav");
            System.out.println(sb);

            System.out.println(sb.length());
            System.out.println(sb.capacity());
            //we can convert strinBuffer data to string format using toString()

            String name = sb.toString();
            System.out.println(name);
        }




}
