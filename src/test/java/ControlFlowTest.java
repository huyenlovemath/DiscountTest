import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControlFlowTest {
    DiscountCalculator discountCalculator;

    public ControlFlowTest() {
        discountCalculator = new DiscountCalculator();
    }
    @Test
    public void test1(){ assertEquals(-1, discountCalculator.getDiscount(-20, 2, 2012)); }
    @Test
    public void test2(){
        assertEquals(35, discountCalculator.getDiscount(75, 11, 2015));
    }
    @Test
    public void test3(){
        assertEquals(10, discountCalculator.getDiscount(55, 4, 2019));
    }
    @Test
    public void test4(){
        assertEquals(15, discountCalculator.getDiscount(101, 20, 2020));
    }
    @Test
    public void test5(){
        assertEquals(25, discountCalculator.getDiscount(60, 21, 2021));
    }
    @Test
    public void test6(){
        assertEquals(0, discountCalculator.getDiscount(101, 10, 2020));
    }





}
