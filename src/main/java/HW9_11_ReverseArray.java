public class HW9_11_ReverseArray {
    /******************************************************************************************************************

     11.	 Написать алгоритм ReverseArray, который принимает на вход массив целых чисел,
     и возвращает “перевернутый” массив.
     Test Data:
     {2, 7, 3, 10} → {10, 3, 7, 2}
     */
    public int[] getReverseArray(int[] array) {
        int[] result = new int[array.length];
        int count = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            result[count] = array[i];
            count++;
        }

        return result;
    }
}
