public class StringTesting {
public static void main(String[] args) {

        System.out.println("Hello, Wisconsin");

        String testingThisString = "Hashtag affogato pork belly hipster lorem ipsum!";
        String name = new String("Fluffy");

        //get string length. Notice starts stringlength at 1, not at 0
        System.out.println("This string length is: " + testingThisString.length());

        //use the charat method
        System.out.print("The character at location 5 is : ");
        System.out.println(testingThisString.charAt(5));


}
}
