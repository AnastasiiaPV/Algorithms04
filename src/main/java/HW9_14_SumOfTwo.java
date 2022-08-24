import java.util.Arrays;

public class HW9_14_SumOfTwo {
    /******************************************************************************************************************
     14.	Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,  и число n.
     Алгоритм  возвращает пары элементов, которые в сумме дают число n.
     Test Data:
     ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
     */
    public int[][] getSumOfTwo(int[] arr, int n) {
        int[][] result = {};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int[] pair = new int[2];

                if (arr[i] + arr[j] == n) {
                    pair[0] = arr[i];
                    pair[1] = arr[j];
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = pair;
                }
            }
        }
        return result;
    }

}
