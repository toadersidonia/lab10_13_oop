import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {

    @Test
    public void testGetName(){
        Dog rex = new Dog("Rex", 11);
        assertEquals(rex.getName(), "Rex");
        assertEquals(rex.getAge(), 11);
    }

    @Test
    public void testSetName(){
        Dog rex = new Dog("Rex", 11);
        rex.setName("Azor");
        rex.setAge(23);
        assertEquals(rex.getName(), "Azor");
        assertEquals(rex.getAge(), 23);
    }

}
