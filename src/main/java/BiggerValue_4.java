public class BiggerValue_4 {

    /******************************************************************************************************************
     4. Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
     Test Data:
     3333, 9999
     Expected Result = 9999
     */
    public int getBiggerValue(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public int getBiggerValue_2(int a, int b) {
        return Math.max(a, b);
    }
}
