import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW9_5_IsPositiveNumber_Test {

    //        555, 0 и -555.

    @Test
    public void testPositiveNumber_1() {
        //Task 5
        int number = 555;
        boolean expectedResult = true;

        HW9_5_IsPositiveNumber isPositiveNumber_5 = new HW9_5_IsPositiveNumber();
        boolean actualResult = isPositiveNumber_5.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveNumber_2() {
        //Task 5
        int number = 0;
        boolean expectedResult = true;

        HW9_5_IsPositiveNumber isPositiveNumber_5 = new HW9_5_IsPositiveNumber();
        boolean actualResult = isPositiveNumber_5.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveNumber_3() {
        //Task 5
        int number = -555;
        boolean expectedResult = false;

        HW9_5_IsPositiveNumber isPositiveNumber_5 = new HW9_5_IsPositiveNumber();
        boolean actualResult = isPositiveNumber_5.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
