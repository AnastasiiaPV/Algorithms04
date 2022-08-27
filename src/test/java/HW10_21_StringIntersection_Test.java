import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW10_21_StringIntersection_Test {

    //Test Data:
    //     *      “Carrot”, “carwash” → “car”
    //     *      “Noob”, “Schmooze” → “oo”

    @Test
    public void testConvertStringToNumbers() {

        String input = "1, 2, 3, 4, 5";
        int[] expectedResult = new int[] {1, 2, 3, 4, 5};

        HW10_15_StringToNumbers stringToNumbers = new HW10_15_StringToNumbers();
        int[] actualResult = stringToNumbers.convertStringToNumbers(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
