import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataFlowTest {
    DiscountCalculator discountCalculator;

    public DataFlowTest() {
        discountCalculator = new DiscountCalculator();
    }
    @Test
    public void test1(){ assertEquals(-1, discountCalculator.getDiscount(0, 0, 0)); }
    @Test
    public void test2(){
        assertEquals(10, discountCalculator.getDiscount(51, 19, 2021));
    }
    @Test
    public void test3(){
        assertEquals(10, discountCalculator.getDiscount(62, 18, 2020));
    }
    @Test
    public void test4(){
        assertEquals(15, discountCalculator.getDiscount(101, 20, 2019));
    }
    @Test
    public void test5(){
        assertEquals(35, discountCalculator.getDiscount(52, 15, 2018));
    }
    @Test
    public void test6(){
        assertEquals(10, discountCalculator.getDiscount(53, 11, 2021));
    }
    @Test
    public void test7(){
        assertEquals(25, discountCalculator.getDiscount(500, 1, 2012));
    }
    @Test
    public void test8(){
        assertEquals(0, discountCalculator.getDiscount(501, 3, 2019));
    }
    @Test
    public void test9(){
        assertEquals(35, discountCalculator.getDiscount(77, 12, 2018));
    }
    @Test
    public void test10(){
        assertEquals(10, discountCalculator.getDiscount(78, 11, 2021));
    }
    @Test
    public void test11(){
        assertEquals(40, discountCalculator.getDiscount(122, 23, 2018));
    }
    @Test
    public void test12(){
        assertEquals(15, discountCalculator.getDiscount(110, 40, 2021));
    }
    @Test
    public void test13(){
        assertEquals(50, discountCalculator.getDiscount(25, 1, 2014));
    }
    @Test
    public void test14(){
        assertEquals(25, discountCalculator.getDiscount(10, 16, 2020));
    }
    @Test
    public void test15(){
        assertEquals(35, discountCalculator.getDiscount(89, 7, 2013));
    }





}
