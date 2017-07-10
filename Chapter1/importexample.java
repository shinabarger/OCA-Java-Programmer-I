import java.util.*;
import java.junit.*;
import static org.junit.Assert.assertEquals;

public class ImportExample {
public static void main (String[] args) {
        Random r = new Random();
        System.out.print("Your random number is: ");
        int randomNumberGenerated = r.nextInt(10);
        System.out.println(randomNumberGenerated);


}

public class TestJUnit {


@Test
public void testAdd() {
  String string = "Junit works.";
  assertEquals("Junit works.", string);
}
}
}


}
