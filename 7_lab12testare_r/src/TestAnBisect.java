import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;

public class TestAnBisect {
    @Test
    public void testAnBisect(){
        AnBisect anBisect = new AnBisect();

        Assert.assertTrue(anBisect.esteAnBisect(4));
        Assert.assertTrue(!anBisect.esteAnBisect(99));
        Assert.assertTrue(!anBisect.esteAnBisect(100));
        Assert.assertTrue(!anBisect.esteAnBisect(500));
    }
}
