public class KthLargest_13 {
    /******************************************************************************************************************
     13. Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k,
     и возвращает k-тый максимальный элемент.
     Test Data:
     ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9*/

    public int getKthLargest(int[] a, int k) {
        int max = 0;

        for (int i = 0; k > 0; i++) {
            if (a[i] < a[i + 1]) {
                max = a[i + 1];
                k--;
            }
        }
        return max;
    }

    /**
     * (12 и 12 - первый и второй самые большие элементы)
     */
    public int[] getKthLargest_2(int[] a) {
        int max1 = a[0];
        int max2 = a[0];
        int positionMax1 = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max1) {
                max1 = a[i];
                positionMax1 = i;
            }
        }
        a[positionMax1] = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max2) {
                max2 = a[i];
            }
        }

        return new int[]{max1, max2};
    }
}
