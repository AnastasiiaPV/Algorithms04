import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.Test;

public class NegativeOnTheRight_13_Test {

//        Test Data:
//        {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}

    @Test
    public void testNegativeOnTheRight() {
        //Task 13
        int[] input = new int[]{4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = new int[]{4, 7, 5, 9, 4, 12, -3, -12, -28};

        NegativeOnTheRight_13 negativeOnTheRight_13 = new NegativeOnTheRight_13();
        int[] actualResult = negativeOnTheRight_13.getNegativeOnTheRight(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
