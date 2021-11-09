import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquivalentClassPartitionTest {
    DiscountCaculator discountCaculator = new DiscountCaculator();


    @Test
    public void test1(){
        assertEquals(50, discountCaculator.getDiscount(25, 9, 2015));
    }
    @Test
    public void test2(){
        assertEquals(25, discountCaculator.getDiscount(25, 9, 2020));
    }
    @Test
    public void test3(){
        assertEquals(-1, discountCaculator.getDiscount(25, 9, 2023));
    }
    @Test
    public void test4(){
        assertEquals(50, discountCaculator.getDiscount(25, 66, 2015));
    }
    @Test
    public void test5(){
        assertEquals(25, discountCaculator.getDiscount(25, 66, 2020));
    }
    @Test
    public void test6(){
        assertEquals(-1, discountCaculator.getDiscount(25, 66, 2023));
    }
    @Test
    public void test7(){
        assertEquals(-1, discountCaculator.getDiscount(25, -8, 2015));
    }
    @Test
    public void test8(){
        assertEquals(-1, discountCaculator.getDiscount(25, -8, 2020));
    }
    @Test
    public void test9(){
        assertEquals(-1, discountCaculator.getDiscount(25, -8, 2023));
    }
    @Test
    public void test10(){
        assertEquals(35, discountCaculator.getDiscount(75, 9, 2015));
    }
    @Test
    public void test11(){
        assertEquals(10, discountCaculator.getDiscount(75, 9, 2020));
    }
    @Test
    public void test12(){
        assertEquals(-1, discountCaculator.getDiscount(75, 9, 2023));
    }

    @Test
    public void test13(){
        assertEquals(50, discountCaculator.getDiscount(75, 66, 2015));
    }
    @Test
    public void test14(){
        assertEquals(25, discountCaculator.getDiscount(75, 66, 2020));
    }
    @Test
    public void test15(){
        assertEquals(-1, discountCaculator.getDiscount(75, 66, 2023));
    }
    @Test
    public void test16(){
        assertEquals(-1, discountCaculator.getDiscount(75, -8, 2015));
    }
    @Test
    public void test17(){
        assertEquals(-1, discountCaculator.getDiscount(75, -8, 2020));
    }
    @Test
    public void test18(){
        assertEquals(-1, discountCaculator.getDiscount(75, -8, 2023));
    }
    @Test
    public void test19(){
        assertEquals(25, discountCaculator.getDiscount(500, 9, 2015));
    }
    @Test
    public void test20(){
        assertEquals(0, discountCaculator.getDiscount(500, 9, 2020));
    }
    @Test
    public void test21(){
        assertEquals(-1, discountCaculator.getDiscount(500, 9, 2023));
    }
    @Test
    public void test22(){
        assertEquals(40, discountCaculator.getDiscount(500, 66, 2015));
    }
    @Test
    public void test23(){
        assertEquals(15, discountCaculator.getDiscount(500, 66, 2020));
    }
    @Test
    public void test24(){
        assertEquals(-1, discountCaculator.getDiscount(500, 66, 2023));
    }

    @Test
    public void test25(){
        assertEquals(-1, discountCaculator.getDiscount(500, -8, 2015));
    }
    @Test
    public void test26(){
        assertEquals(-1, discountCaculator.getDiscount(500, -8, 2020));
    }
    @Test
    public void test27(){
        assertEquals(-1, discountCaculator.getDiscount(500, -8, 2023));
    }
    @Test
    public void test28(){
        assertEquals(-1, discountCaculator.getDiscount(1500, 9, 2015));
    }
    @Test
    public void test29(){
        assertEquals(-1, discountCaculator.getDiscount(1500, 9, 2020));
    }
    @Test
    public void test30(){
        assertEquals(-1, discountCaculator.getDiscount(1500, 9, 2023));
    }
    @Test
    public void test31(){
        assertEquals(-1, discountCaculator.getDiscount(1500, 66, 2015));
    }
    @Test
    public void test32(){
        assertEquals(-1, discountCaculator.getDiscount(1500, 66, 2020));
    }
    @Test
    public void test33(){
        assertEquals(-1, discountCaculator.getDiscount(1500, 66, 2023));
    }
    @Test
    public void test34(){
        assertEquals(-1, discountCaculator.getDiscount(1500, -8, 2015));
    }
    @Test
    public void test35(){
        assertEquals(-1, discountCaculator.getDiscount(1500, -8, 2020));
    }
    @Test
    public void test36(){
        assertEquals(-1, discountCaculator.getDiscount(1500, -8, 2023));
    }


}
