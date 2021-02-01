import com.digite.kata.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    Vehicle vehicle;

    @BeforeEach
    public void setUp() {
        vehicle = new Vehicle(10);
    }

    @Test
    public void testCapacity() {
        Assertions.assertEquals(10, vehicle.getMaxFuel());
    }
}
