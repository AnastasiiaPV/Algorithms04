public class ReverseArray_11 {
    /******************************************************************************************************************

     11.	 Написать алгоритм ReverseArray, который принимает на вход массив целых чисел,
     и возвращает “перевернутый” массив.
     Test Data:
     {2, 7, 3, 10} → {10, 3, 7, 2}
     */
    public int[] getReverseArray(int[] a) {
        int[] newArr = new int[a.length];
        int count = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            newArr[count] = a[i];
            count++;
        }

        return newArr;
    }
}
