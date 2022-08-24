public class HW9_8_MinMaxAve {
    /******************************************************************************************************************
     ?????????????????????????????????????????????????????????????????????????????
     8. Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
     Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
     и среднее среди всех значений между 2-мя индексами.

     Test Data:
     ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    public int[] getMinMaxAve(int[] n, int index1, int index2) {
        int min = getMin(n, index1, index2);
        int max = getMax(n, index1, index2);
        int avg = getAvg(n, index1, index2);

        return new int[]{min, max, avg};
    }

    private int getMin(int[] n, int index1, int index2) {
        int min = Integer.MAX_VALUE;

        for (int i = index1; i <= index2; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }
        return min;
    }

    private int getMax(int[] n, int index1, int index2) {
        int max = Integer.MIN_VALUE;

        for (int i = index1; i <= index2; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        return max;
    }

    private int getAvg(int[] n, int index1, int index2) {
        int avg = 0;

        for (int i = index1; i < index2; i++) {
            for (int j = i + 1; j < index2 - 1; j++) {
                if (n[i] > avg && n[i] < n[j]) {
                    avg = n[i];
                } else if (n[i] > avg && n[i] > n[j]) {
                    avg = n[j];
                }
            }
        }
        return avg;
    }
}
