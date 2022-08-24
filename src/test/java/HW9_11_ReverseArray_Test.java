import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW9_11_ReverseArray_Test {


//        Test Data:
//        {2, 7, 3, 10} → {10, 3, 7, 2}

    @Test
    public void testReverseArray() {
        //Task 11
        int[] input = new int[]{2, 7, 3, 10};
        int[] expectedResult = new int[]{10, 3, 7, 2};

        HW9_11_ReverseArray reverseArray_11 = new HW9_11_ReverseArray();
        int[] actualResult = reverseArray_11.getReverseArray(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
