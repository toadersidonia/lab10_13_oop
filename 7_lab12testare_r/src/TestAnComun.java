import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertFalse;
public class TestAnComun {
    @Test
    public void test2(){
        AnBisect anBisect = new AnBisect();
        Assert.assertFalse(!anBisect.esteAnBisect(4));
        Assert.assertFalse(anBisect.esteAnBisect(99));
        Assert.assertFalse(anBisect.esteAnBisect(100));
        Assert.assertFalse(anBisect.esteAnBisect(500));

    }
}
