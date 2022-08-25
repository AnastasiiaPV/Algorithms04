public class HW9_5_IsPositiveNumber {

    /******************************************************************************************************************
     5. Напишите алгоритм IsPositiveNumber, который возвращает true, если численный  параметр больше или равен нулю,
     и возвращает false, если параметр меньше 0.
     Проверьте работу метода на числах 555, 0 и -555.*/
    public boolean isPositiveNumber(int a) {
        return a >= 0;
    }

    public boolean isPositiveNumber_1(int a) {
        return a <= 0 ? true : false;
    }
}
