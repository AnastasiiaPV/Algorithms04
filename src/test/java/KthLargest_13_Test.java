import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargest_13_Test {

    @Test
    public void testKthLargest_1() {
//        Task 13 Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k,
//     и возвращает k-тый максимальный элемент.
//        Test Data:
//        ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9

        int[] input = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int num = 3;
        int expectedResult = 9;

        KthLargest_13 kthLargest_13 = new KthLargest_13();
        int actualResult = kthLargest_13.getKthLargest(input, num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargest_2() {
        int[] input = new int[]{2, 3, 5, 0, 1};
        int num = 2;
        int expectedResult = 5;

        KthLargest_13 kthLargest_13 = new KthLargest_13();
        int actualResult = kthLargest_13.getKthLargest(input, num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargest_2_1() {
        //     (12 и 12 - первый и второй самые большие элементы)

        int[] input = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = new int[]{12, 12};

        KthLargest_13 kthLargest_13 = new KthLargest_13();
        int[] actualResult = kthLargest_13.getKthLargest_2(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargest_2_2() {
        //     (12 и 12 - первый и второй самые большие элементы)

        int[] input = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 13};
        int[] expectedResult = new int[]{12, 13};

        KthLargest_13 kthLargest_13 = new KthLargest_13();
        int[] actualResult = kthLargest_13.getKthLargest_2(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
