import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeakElement_10_Test {

//        Test Data:
//        {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}


    @Test
    public void testPeakElement() {
        //Task 10
        int[] input = new int[]{3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = new int[]{3, 7, 23};

        PeakElement_10 peakElement_10 = new PeakElement_10();
        int[] actualResult = peakElement_10.getPeakElement(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
