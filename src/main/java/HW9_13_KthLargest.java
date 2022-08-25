public class HW9_13_KthLargest {
    /******************************************************************************************************************
     13. Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k,
     и возвращает k-тый максимальный элемент.
     Test Data:
     ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9*/

    public int getKthLargest(int[] arr, int k) {
        int max = 0;

        for (int i = 0; k > 0; i++) {
            if (arr[i] < arr[i + 1]) {
                max = arr[i + 1];
                k--;
            }
        }
        return max;
    }

    /**
     * (12 и 12 - первый и второй самые большие элементы)
     */
    public int[] getKthLargest_2(int[] arr) {
        int max1 = arr[0];
        int max2 = arr[0];
        int positionMax1 = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
                positionMax1 = i;
            }
        }
        arr[positionMax1] = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max2) {
                max2 = arr[i];
            }
        }

        return new int[]{max1, max2};
    }
}
