import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import org.junit.runner.notification.Failure;

public class TestRunner {
public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJUnit.class);

        for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
}
}