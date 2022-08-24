import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW9_10_PeakElement_Test {

//        Test Data:
//        {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}


    @Test
    public void testPeakElement() {
        //Task 10
        int[] input = new int[]{3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = new int[]{3, 7, 23};

        HW9_10_PeakElement peakElement_10 = new HW9_10_PeakElement();
        int[] actualResult = peakElement_10.getPeakElement(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
