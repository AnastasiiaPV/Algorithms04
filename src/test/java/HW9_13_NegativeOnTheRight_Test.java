import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW9_13_NegativeOnTheRight_Test {

//        Test Data:
//        {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}

    @Test
    public void testNegativeOnTheRight() {
        //Task 13
        int[] input = new int[]{4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = new int[]{4, 7, 5, 9, 4, 12, -3, -12, -2};

        HW9_13_NegativeOnTheRight negativeOnTheRight_13 = new HW9_13_NegativeOnTheRight();
        int[] actualResult = negativeOnTheRight_13.getNegativeOnTheRight(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
