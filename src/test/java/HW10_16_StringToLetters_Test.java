import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW10_16_StringToLetters_Test {
//виправити тест дату в усіх варіантах
    @Test
    public void testConvertStringToLetters() {

        String input = "1, 2, 3, 4, 5";
        int[] expectedResult = new int[] {1, 2, 3, 4, 5};

        HW10_16_StringToLetters stringToLetters  = new HW10_16_StringToLetters();
        int[] actualResult = stringToLetters.convertStringToLetters(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testConvertStringToLettersAndSpaces() {

        String input = "1, 2, 3, 4, 5";
        int[] expectedResult = new int[] {1, 2, 3, 4, 5};

        HW10_16_StringToLetters stringToLettersAndSpaces  = new HW10_16_StringToLetters();
        int[] actualResult = stringToLettersAndSpaces.convertStringToLettersAndSpaces(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testConvertSringToNumbers() {

        String input = "1, 2, 3, 4, 5";
        int[] expectedResult = new int[] {1, 2, 3, 4, 5};

        HW10_16_StringToLetters sringToNumbers  = new HW10_16_StringToLetters();
        int[] actualResult = sringToNumbers.convertStringToNumbers(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testConvertStringToNumbersAndSpaces() {

        String input = "1, 2, 3, 4, 5";
        int[] expectedResult = new int[] {1, 2, 3, 4, 5};

        HW10_16_StringToLetters stringToNumbersAndSpaces  = new HW10_16_StringToLetters();
        int[] actualResult = stringToNumbersAndSpaces.convertStringToNumbersAndSpaces(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
