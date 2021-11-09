public class DiscountCalculator {

    public static void main(String[] args) {
        System.out.println("Nguyen Thanh Huyen \n18020666");
    }
    /*
     *
     * @param x for id card
     * @param y for the number of products in the order
     * @param z for the number of member's years
     * @return an int value for the percentage of discount
     */

    public int getDiscount(int x, int y, int z) {

        int nDiscount = 0;
        //
        // cases of invalid input will return -1
        //
        if (x < 1 || x > 1000) {
            return -1;
        }
        if (y < 1 || y > 100) {
            return -1;
        }
        if (z < 2011 || z > 2021) {
            return -1;
        }
        //
        // discount of 0
        //
        if (100 < x && y < 20) {
            nDiscount = 0;
        }
        //
        // discount of 10 %
        //
        if (50 < x && x <= 100 && y < 20) {
            nDiscount = 10;
        }
        //
        // discount of 15%
        //
        if (100 < x && 20 <= y ) {
            nDiscount = 15;
        }

        //
        // discount of 25%
        //
        if ((x <= 50) || ( x <= 100 && 20 <= y)) {
            nDiscount = 25;
        }

        //
        // bonus 25% discount for gold member
        //

        if ( z <= 2018 ) {
            nDiscount += 25;
        }


        return nDiscount;
    }
}
