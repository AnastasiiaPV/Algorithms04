import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.Test;

public class IsPositiveNumber_5_Test {

    //        555, 0 и -555.

    @Test
    public void testPositiveNumber_1() {
        //Task 5
        int number = 555;
        boolean expectedResult = true;

        IsPositiveNumber_5 isPositiveNumber_5 = new IsPositiveNumber_5();
        boolean actualResult = isPositiveNumber_5.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveNumber_2() {
        //Task 5
        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber_5 isPositiveNumber_5 = new IsPositiveNumber_5();
        boolean actualResult = isPositiveNumber_5.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveNumber_3() {
        //Task 5
        int number = -555;
        boolean expectedResult = false;

        IsPositiveNumber_5 isPositiveNumber_5 = new IsPositiveNumber_5();
        boolean actualResult = isPositiveNumber_5.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
