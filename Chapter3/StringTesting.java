import java.lang.*;
import java.io.*;

public class StringTesting{
public static void main(String[] args) {

        System.out.println("Hello, Wisconsin");

        String testingThisString = "Hashtag affogato pork belly hipster lorem ipsum!";
        String name = new String("Fluffy");

        //get string length. Notice starts stringlength at 1, not at 0
        System.out.println("This string length is: " + testingThisString.length());

        //use the charat method
        //notice that the charat method starts at 0, not at 1 like the length method.
        System.out.print("The character at location 5 is : ");
        System.out.println(testingThisString.charAt(5));

        //this should throw an exception -- specifically a StringIndexOutOfBoundException
        //just gonna comment it out so we can keep compiling it, but hold it here as an example
        //System.out.println(testingThisString.charAt(500));

        //substring generic
        //again starts at 0 and prints out everything starting at 3 and after.
        System.out.println(testingThisString.substring(3));

        //this prints out the first instance of a specific letter and everything afterwards
        System.out.println(testingThisString.substring(testingThisString.indexOf('p')));




}
}
