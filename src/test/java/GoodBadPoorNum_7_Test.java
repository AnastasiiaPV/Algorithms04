import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GoodBadPoorNum_7_Test {

//        If M is multiple of 3 and 5 then return "Good Number".
//        If M is only multiple of 3 and not of 5 then return "Bad Number"
//        If M is only multiple of 5 and not of 3 then return "Poor Number"
//        If M doesn't satisfy any of the above conditions then return "-1"


    @Test
    public void testGoodBadPoorNum_1() {
        //Task 7
        int number = 15;
        String expectedResult = "Good Number";

        GoodBadPoorNum_7 goodBadPoorNum_7 = new GoodBadPoorNum_7();
        String actualResult = goodBadPoorNum_7.checkGoodBadPoorNum(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGoodBadPoorNum_2() {
        //Task 7
        int number = 9;
        String expectedResult = "Bad Number";

        GoodBadPoorNum_7 goodBadPoorNum_7 = new GoodBadPoorNum_7();
        String actualResult = goodBadPoorNum_7.checkGoodBadPoorNum(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGoodBadPoorNum_3() {
        //Task 7
        int number = 25;
        String expectedResult = "Poor Number";

        GoodBadPoorNum_7 goodBadPoorNum_7 = new GoodBadPoorNum_7();
        String actualResult = goodBadPoorNum_7.checkGoodBadPoorNum(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGoodBadPoorNum_4() {
        //Task 7
        int number = 0;
        String expectedResult = "Good Number";

        GoodBadPoorNum_7 goodBadPoorNum_7 = new GoodBadPoorNum_7();
        String actualResult = goodBadPoorNum_7.checkGoodBadPoorNum(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGoodBadPoorNum_5() {
        //Task 7
        int number = 22;
        String expectedResult = "-1";

        GoodBadPoorNum_7 goodBadPoorNum_7 = new GoodBadPoorNum_7();
        String actualResult = goodBadPoorNum_7.checkGoodBadPoorNum(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
