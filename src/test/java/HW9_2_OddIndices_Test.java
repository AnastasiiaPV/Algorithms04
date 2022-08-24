import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW9_2_OddIndices_Test {

//        Input = {-45, 590, 234, 985, 12, 68}
//        Expected Result =  {590, 985, 68}


    @Test
    public void testOddIndices() {
        //Task 2
        int[] input = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedResult = new int[]{590, 985, 68};

        HW9_2_OddIndices oddIndices_2 = new HW9_2_OddIndices();
        int[] actualResult = oddIndices_2.getOddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
