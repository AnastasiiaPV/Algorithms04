import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW9_7_GoodBadPoorNum_Test {

//        If M is multiple of 3 and 5 then return "Good Number".
//        If M is only multiple of 3 and not of 5 then return "Bad Number"
//        If M is only multiple of 5 and not of 3 then return "Poor Number"
//        If M doesn't satisfy any of the above conditions then return "-1"


    @Test
    public void testGoodBadPoorNum_1() {
        //Task 7
        int number = 15;
        String expectedResult = "Good Number";

        HW9_7_GoodBadPoorNum HW9_7GoodBadPoorNum = new HW9_7_GoodBadPoorNum();
        String actualResult = HW9_7GoodBadPoorNum.checkGoodBadPoorNum(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGoodBadPoorNum_2() {
        //Task 7
        int number = 9;
        String expectedResult = "Bad Number";

        HW9_7_GoodBadPoorNum HW9_7GoodBadPoorNum = new HW9_7_GoodBadPoorNum();
        String actualResult = HW9_7GoodBadPoorNum.checkGoodBadPoorNum(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGoodBadPoorNum_3() {
        //Task 7
        int number = 25;
        String expectedResult = "Poor Number";

        HW9_7_GoodBadPoorNum HW9_7GoodBadPoorNum = new HW9_7_GoodBadPoorNum();
        String actualResult = HW9_7GoodBadPoorNum.checkGoodBadPoorNum(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGoodBadPoorNum_4() {
        //Task 7
        int number = 0;
        String expectedResult = "Good Number";

        HW9_7_GoodBadPoorNum HW9_7GoodBadPoorNum = new HW9_7_GoodBadPoorNum();
        String actualResult = HW9_7GoodBadPoorNum.checkGoodBadPoorNum(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGoodBadPoorNum_5() {
        //Task 7
        int number = 22;
        String expectedResult = "-1";

        HW9_7_GoodBadPoorNum HW9_7GoodBadPoorNum = new HW9_7_GoodBadPoorNum();
        String actualResult = HW9_7GoodBadPoorNum.checkGoodBadPoorNum(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
