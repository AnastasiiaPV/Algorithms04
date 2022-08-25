import java.util.Arrays;

public class HW9_2_OddIndices {

    /******************************************************************************************************************
     2. Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
     Test Data:
     Input = {-45, 590, 234, 985, 12, 68}
     Expected Result =  {590, 985, 68}
     */
    public int[] getOddIndices(int[] n) {
        int[] result = {};

        for (int i = 0; i < n.length; i++) {
            if (i % 2 != 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = n[i];
            }
        }
        return result;
    }

    public int[] getOddIndices_2(int[] n) {
        int[] result = new int[n.length/2];
        int j = 0;

        for (int i = 0; i < n.length; i++) {
                if (i % 2 != 0) {
                    result[j] = n[i];
                    j++;
                }
            }
        return result;
    }

    public int[] getOddIndices_3(int[] n) {
        int[] result = new int[n.length/2];
        int j = 0;

        for (int i = 1; i < n.length; i+=2) {
                result[j] = n[i];
                j++;

        }
        return result;
    }
}
