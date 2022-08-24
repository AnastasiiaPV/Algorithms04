public class HW9_12_SortArray {
    /******************************************************************************************************************
     12.	Написать алгоритм SortArray, который принимает на вход массив целых чисел,
     и сортирует элементы массива в порядке возрастания.
     Test Data:
     {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
     */
    public int[] sortArrayDesc(int[] a) {
        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public int[] sortArrayAsc(int[] a) {
        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }
}
