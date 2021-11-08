import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquivalentClassPartitionTest {
    DiscountCaculator discountCaculator = new DiscountCaculator();

    @Test
    public void test( int x_value, int y_value, int z_value, int expected_value){
        assertEquals(expected_value, DiscountCaculator.getDiscount(x_value, y_value, z_value));
        System.out.println("Test success");
    }

}
