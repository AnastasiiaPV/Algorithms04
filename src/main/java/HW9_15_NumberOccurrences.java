import java.util.Arrays;

public class HW9_15_NumberOccurrences {
    /******************************************************************************************************************
     15.	Написать алгоритм NumberOccurrences,  который принимает на вход массив целых чисел,  и возвращает массив пар
     {число, сколько раз число встречается в массиве}
     Test Data:
     {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
     {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}
     */
    public int[][] getNumberOccurrences(int[] arr) {
        int[][] result = {};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int[] pair = new int[2];

            if (arr[i] != 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        arr[j] = 0;
                        count++;
                    }
                }

                pair[0] = arr[i];
                pair[1] = count + 1;
                count = 0;

                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = pair;
            }
        }

        return sortDoubleArr(result);
    }

    private int[][] sortDoubleArr(int[][] arr) {
        int[] temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][0] < arr[j][0]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
