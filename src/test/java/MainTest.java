import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void Test1() {
        //arrange

        //act
        String message = Main.getMessage();
        //assert
        Assert.assertEquals("hello", message);
    }
}
