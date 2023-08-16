import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoffeeTest {
    private double deltaValue = 0.000001;
	private Coffee emptyCoffee;
	private Coffee actualCoffee;

	@Before
	public void setup() {
		actualCoffee = new Coffee("The Bean-i-nator", "espresso", 5.99);
	}

	@Test
	public void	testCoffeeNoArgConstructors() {
		actualCoffee = new Coffee();

		// assert that emptyCoffee is null
		assertNull(emptyCoffee);

		// assert that actualCoffee is not null
		assertNotNull(actualCoffee);
	}

	@Test
	public void testCoffeeThreeArgConstructors() {
		assertNotNull(actualCoffee);
	}

	@Test
	public void	testCoffeeGetters() {
		assertEquals(actualCoffee.getName(), "The Bean-i-nator");
		assertEquals(actualCoffee.getRoast(), "espresso");
		assertEquals(actualCoffee.getPrice(), 5.99, deltaValue);
	}





}
