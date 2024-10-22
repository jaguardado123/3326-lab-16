import static org.junit.Assert.*;
import org.junit.Test;

public class DealershipTest {
	
	@Test
	public void testing_car1() {
        Car car = new Car("Toyota", "Camry", 2000);
		assertEquals(false, car.is_new());
	}

	@Test
	public void testing_car2() {
        Car car = new Car("Ford", "Mustang", 2024);
		assertEquals(true, car.is_new());
	}

	@Test
	public void testing_car3() {
        Car car = new Car("Chevy", "Silverado", 2025);
		assertEquals(true, car.is_new());
	}
}