import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.Test;

public class OddIndices_2_Test {

//        Input = {-45, 590, 234, 985, 12, 68}
//        Expected Result =  {590, 985, 68}


    @Test
    public void testOddIndices() {
        //Task 2
        int[] input = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedResult = new int[]{590, 985, 68};

        OddIndices_2 oddIndices_2 = new OddIndices_2();
        int[] actualResult = oddIndices_2.getOddIndices(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
