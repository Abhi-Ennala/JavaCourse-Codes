import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sam {

    public static void main(String[] args) throws IOException {

//      int x= System.in.read();
//        System.out.println(); Give output in the form of ASCII values

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num =Integer.parseInt( bf.readLine());
        System.out.println(num);


    }
}
