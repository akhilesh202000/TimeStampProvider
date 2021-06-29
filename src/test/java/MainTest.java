import org.junit.Assert;
import org.junit.Test;
import swlcm.sample1.SampleController;

public class MainTest {


    @Test
    public void Test_SampleController() {
        //arrange
        SampleController sc = new SampleController();
        //act
        String sample = sc.GetSample();
        //assert
        Assert.assertEquals("counter: 1", sample);
    }

}
