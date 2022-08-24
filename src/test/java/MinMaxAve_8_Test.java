import org.junit.jupiter.api.Assertions;

public class MinMaxAve_8_Test {
    //        Test Data:
    //        ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
    //
    //3, 4, 5, 6, 7, -> min=3, max =7 avg = 5
    //6, 2, 4, 8, 7,-> min=2, max =8 avg = 6


   // @Test
    public void testMinMaxAve_1() {
        //Task 8
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int numOne = 2;
        int numTwo = 6;
        int[] expectedResult = new int[]{3, 7, 5};

        MinMaxAve_8 minMaxAve_8 = new MinMaxAve_8();
        int[] actualResult = minMaxAve_8.getMinMaxAve(input, numOne, numTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    // @Test
    public void testMinMaxAve_2() {
        //Task 8
        int[] input = new int[]{5, 1, 6, 2, 4, 8, 7, 3};
        int numOne = 2;
        int numTwo = 6;
        int[] expectedResult = new int[]{3, 7, 5};

        MinMaxAve_8 minMaxAve_8 = new MinMaxAve_8();
        int[] actualResult = minMaxAve_8.getMinMaxAve(input, numOne, numTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
