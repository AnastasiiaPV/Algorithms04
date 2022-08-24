import java.util.Arrays;

public class Intersection_9 {
    /******************************************************************************************************************
     9. 	Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и
     возвращает массив общих элементов.
     Test Data:
     {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
     {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
     {1, 2, 4, 5, 89}, {8, 9, 45} → {}
     */
    public int[] getIntersection(int[] a, int[] b) {
        int[] newArr = {};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    newArr = Arrays.copyOf(newArr, newArr.length + 1);
                    newArr[newArr.length - 1] = a[i];
                }
            }
        }
        return newArr;
    }

    public int[] getIntersection_2(int[] a, int[] b) {
        int[] newArr = {};
        for (int k : a) {
            for (int i : b) {
                if (k == i) {
                    newArr = Arrays.copyOf(newArr, newArr.length + 1);
                    newArr[newArr.length - 1] = k;
                }
            }
        }
        return newArr;
    }
}
