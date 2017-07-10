import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import org.junit.runner.notification.Failure;

public class TestJUnit {


@Test
public void testAdd() {
  String string = "Junit works.";
  assertEquals("Junit works.", string);
}
}
