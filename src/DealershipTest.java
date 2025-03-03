import static org.junit.Assert.*;
import org.junit.Test;

public class DealershipTest {

	@Test
	public void testing_car_make() {
        Car car = new Car("Toyota", "Camry", 2000);
		assertEquals("Toyota", car.make);
	}

	@Test
	public void testing_car_model() {
        Car car = new Car("Ford", "Mustang", 2011);
		assertEquals("Mustang", car.model);
	}

	@Test
	public void testing_car_year() {
        Car car = new Car("Honda", "Civic", 2005);
		assertEquals(2005, car.year);
	}
	
	@Test
	public void testing_car_2000() {
        Car car = new Car("Toyota", "Camry", 2000);
		assertEquals(false, car.is_new());
	}

	@Test
	public void testing_car_2025() {
        Car car = new Car("Chevy", "Silverado", 2025);
		assertEquals(true, car.is_new());
	}
}