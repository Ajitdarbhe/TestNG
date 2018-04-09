package B1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class NewTest {
	
  @Test
  public void demo() 
  {
	  System.out.println("test anotation");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("before method call");
  }

}
