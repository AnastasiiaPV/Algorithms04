import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HW9_12_SortArray_Test {

//        Test Data:
//        {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}


    @Test
    public void testSortArrayAsc() {
        //Task 12
        int[] input = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = new int[]{2, 3, 4, 4, 5, 7, 9, 12, 12};

        HW9_12_SortArray sortArray_12 = new HW9_12_SortArray();
        int[] actualResult = sortArray_12.sortArrayAsc(input);

        assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testSortArrayDesc() {
        //Task 12
        int[] input = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = new int[]{12, 12, 9, 7, 5, 4, 4, 3, 2};

        HW9_12_SortArray sortArray_12 = new HW9_12_SortArray();
        int[] actualResult = sortArray_12.sortArrayDesc(input);

        assertArrayEquals(expectedResult, actualResult);
    }
}
