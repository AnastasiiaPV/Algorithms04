public class HW9_13_NegativeOnTheRight {
    /******************************************************************************************************************
     13. Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел, и возвращает массив,
     в котором все негативные числа находятся во второй половине массива
     Test Data:
     {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
     //мій результат                   [4, 7, 5, 9, 4, 12, -2, -12, -3]
     */
    public int[] getNegativeOnTheRight(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
