import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before() {
        person = new Person("Sam Smith", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Sam Smith", person.getName());
    }

    @Test
    public void canGetNumOfBags() {
        assertEquals(2, person.getBags());
    }
}
