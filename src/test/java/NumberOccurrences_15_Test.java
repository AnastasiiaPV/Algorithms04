import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.Test;

public class NumberOccurrences_15_Test {

//        Test Data:
//        {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
//        {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}

    @Test
    public void testNumberOccurrences() {
        //Task 15
        int[] input = new int[]{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int[][] expectedResult = new int[][]{{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        NumberOccurrences_15 numberOccurrences_15 = new NumberOccurrences_15();
        int[][] actualResult = numberOccurrences_15.getNumberOccurrences(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
