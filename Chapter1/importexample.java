import java.util.Random;

public class ImportExample {
public static void main (String[] args) {
        Random r = new Random();
        System.out.print("Your random number is: ");
        int randomNumberGenerated = r.nextInt(10);
        System.out.println(randomNumberGenerated);


}


}
