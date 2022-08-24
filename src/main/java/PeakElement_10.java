import java.util.Arrays;

public class PeakElement_10 {
    /******************************************************************************************************************

     10.	Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и
     возвращает значения пиковых элементов (элементы, которые больше своих соседей).
     Test Data:
     {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */
    public int[] getPeakElement(int[] a) {
        int[] newArr = {};

        if (a[0] > a[1]) {
            newArr = Arrays.copyOf(newArr, newArr.length + 1);
            newArr[newArr.length - 1] = a[0];
        }

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] < a[i] && a[i] > a[i + 1]) {
                newArr = Arrays.copyOf(newArr, newArr.length + 1);
                newArr[newArr.length - 1] = a[i];
                ;
            }
        }

        if (a[a.length - 1] > a[a.length - 2]) {
            newArr = Arrays.copyOf(newArr, newArr.length + 1);
            newArr[newArr.length - 1] = a[a.length - 2];
        }

        return newArr;
    }
}
