import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW9_9_Intersection_Test {

//        Test Data:
//        {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
//        {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
//        {1, 2, 4, 5, 89}, {8, 9, 45} → {}


    @Test
    public void testIntersection_1() {
        //Task 9
        int[] arrOne = new int[]{1, 2, 4, 5, 89};
        int[] arrTwo = new int[]{8, 9, 4, 2};

        int[] expectedResult = new int[]{2,4};

        HW9_9_Intersection intersection_9 = new HW9_9_Intersection();
        int[] actualResult = intersection_9.getIntersection(arrOne, arrTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersection_2() {
        //Task 9
        int[] arrOne = new int[]{1, 2, 4, 5, 8, 99};
        int[] arrTwo = new int[]{8, 9, -4, -2};

        int[] expectedResult = new int[]{8, 9};

        HW9_9_Intersection intersection_9 = new HW9_9_Intersection();
        int[] actualResult = intersection_9.getIntersection(arrOne, arrTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersection_3() {
        //Task 9
        int[] arrOne = new int[]{1, 2, 4, 5, 89};
        int[] arrTwo = new int[]{8, 9, 45};

        int[] expectedResult = new int[]{};

        HW9_9_Intersection intersection_9 = new HW9_9_Intersection();
        int[] actualResult = intersection_9.getIntersection(arrOne, arrTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersection_2_1() {
        //Task 9
        int[] arrOne = new int[]{1, 2, 4, 5, 89};
        int[] arrTwo = new int[]{8, 9, 4, 2};

        int[] expectedResult = new int[]{2,4};

        HW9_9_Intersection intersection_9 = new HW9_9_Intersection();
        int[] actualResult = intersection_9.getIntersection(arrOne, arrTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersection_2_2() {
        //Task 9
        int[] arrOne = new int[]{1, 2, 4, 5, 8, 99};
        int[] arrTwo = new int[]{8, 9, -4, -2};

        int[] expectedResult = new int[]{8, 9};

        HW9_9_Intersection intersection_9 = new HW9_9_Intersection();
        int[] actualResult = intersection_9.getIntersection(arrOne, arrTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersection_2_3() {
        //Task 9
        int[] arrOne = new int[]{1, 2, 4, 5, 89};
        int[] arrTwo = new int[]{8, 9, 45};

        int[] expectedResult = new int[]{};

        HW9_9_Intersection intersection_9 = new HW9_9_Intersection();
        int[] actualResult = intersection_9.getIntersection(arrOne, arrTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
