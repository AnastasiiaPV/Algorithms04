import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArray_12_Test {

//        Test Data:
//        {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}


    @Test
    public void testSortArrayAsc() {
        //Task 12
        int[] input = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = new int[]{2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray_12 sortArray_12 = new SortArray_12();
        int[] actualResult = sortArray_12.sortArrayAsc(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testSortArrayDesc() {
        //Task 12
        int[] input = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = new int[]{12, 12, 9, 7, 5, 4, 4, 3, 2};

        SortArray_12 sortArray_12 = new SortArray_12();
        int[] actualResult = sortArray_12.sortArrayDesc(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
