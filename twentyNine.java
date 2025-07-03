
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//println method belong to printStream class, not system class.

public class twentyNine{
    public static void main(String a[]){
        System.out.println("hellow");
        int num = System.in.read();   //system.in.read will give integer value
        //this will give asci value means if i enter 3 as input and print num then i will get 51
        //subtract 48 to get the actual number

        //this create confusion so instead of using this user this:-
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num2 = Integer.parseInt(bf.readLine());

        bf.close();


        //instead of using this -> use scanner
        Scanner sc = new Scanner(System.in);
        int num4 = sc.nextInt();


        //try can be used with final
        //final -> when you want to execute something irrespective of the exception or not
        //final block -> use to close the connection or resource
    }
}