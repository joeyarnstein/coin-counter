
import org.junit.*;
import static org.junit.Assert.*;

public class CountCountTest {

  @Test
  public void count_CorrispondingStringOfNum_String(){
    CountCount testCount = new CountCount();
    assertEquals("$1 and 1 cents.", testCount.CountCents("206"));
  }

}
