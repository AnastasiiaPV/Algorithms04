import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.Test;

public class ReverseArray_11_Test {


//        Test Data:
//        {2, 7, 3, 10} → {10, 3, 7, 2}

    @Test
    public void testReverseArray() {
        //Task 11
        int[] input = new int[]{2, 7, 3, 10};
        int[] expectedResult = new int[]{10, 3, 7, 2};

        ReverseArray_11 reverseArray_11 = new ReverseArray_11();
        int[] actualResult = reverseArray_11.getReverseArray(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
