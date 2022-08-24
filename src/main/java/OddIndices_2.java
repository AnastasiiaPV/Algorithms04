import java.util.Arrays;

public class OddIndices_2 {

    /******************************************************************************************************************
     2. Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
     Test Data:
     Input = {-45, 590, 234, 985, 12, 68}
     Expected Result =  {590, 985, 68}
     */
    public int[] getOddIndices(int[] n) {
        int[] newArray = {};
        for (int i = 0; i < n.length; i++) {
            if (i % 2 != 0) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[newArray.length - 1] = n[i];
            }
        }
        return newArray;
    }
}
