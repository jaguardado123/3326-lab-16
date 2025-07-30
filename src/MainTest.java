import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

	@Test
	public void testing_car() {
        	Car car = new Car("abc", "def", 2000);
		assertEquals("abc", car.make);
		assertEquals("def", car.model);
		assertEquals(2000, car.year);
	}

	@Test
	public void testing_user() {
        	Buyer buyer = new Buyer("abc", 1234567, 600.0f);
		assertEquals("abc", buyer.name);
		assertEquals(1234567, buyer.phone);
		assertEquals(600.0f, buyer.creditScore);
	}
}
