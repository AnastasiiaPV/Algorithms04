import java.util.Arrays;

public class AscendingSequenceTest {
    public static void main(String[] args) {
//           Test Data:
//           -345 →  “Odd”
//           0 →  “Even”
//           222222 →  “Even”
//           2147483647 + 1 →  “Undefined”*/
        printTaskNUmber(1);
        System.out.println(getOddEven(-345));
        System.out.println(getOddEven(0));
        System.out.println(getOddEven(222222));
        System.out.println(getOddEven(2147483647 + 1));


//        Input = {-45, 590, 234, 985, 12, 68}
//        Expected Result =  {590, 985, 68}
        printTaskNUmber(2);
        System.out.println(Arrays.toString(getOddIndices(new int[]{-45, 590, 234, 985, 12, 68})));


//     Test Data:
//     {0, 1, 2, 3, 4, 5} → 15
//     {-7, -3} → -10
        printTaskNUmber(3);
        System.out.println(getSumArray(new int[]{0, 1, 2, 3, 4, 5}));
        System.out.println(getSumArray(new int[]{-7, -3}));

//        Test Data:
//        3333, 9999
//        Expected Result = 9999
        printTaskNUmber(4);
        System.out.println(getBiggerValue(3333, 9999));
        System.out.println(getBiggerValue_2(3333, 9999));

//        555, 0 и -555.
        printTaskNUmber(5);
        System.out.println(isPositiveNumber(555));
        System.out.println(isPositiveNumber(0));
        System.out.println(isPositiveNumber(-555));


//        Test Data:
//        89, 89
//        Expected result: 0
//                -89, 89
//        Expected result: -1
//        89, -89
//        Expected result: 1
        printTaskNUmber(6);
        System.out.println(checkAreNumbersEqual(89, 89));
        System.out.println(checkAreNumbersEqual(-89, 89));
        System.out.println(checkAreNumbersEqual(89, -89));
        System.out.println(checkAreNumbersEqual_2(89, 89));
        System.out.println(checkAreNumbersEqual_2(-89, 89));
        System.out.println(checkAreNumbersEqual_2(89, -89));


//        If M is multiple of 3 and 5 then return "Good Number".
//        If M is only multiple of 3 and not of 5 then return "Bad Number"
//        If M is only multiple of 5 and not of 3 then return "Poor Number"
//        If M doesn't satisfy any of the above conditions then return "-1"
        printTaskNUmber(7);
        System.out.println(checkGoodBadPoorNum(15));
        System.out.println(checkGoodBadPoorNum(9));
        System.out.println(checkGoodBadPoorNum(25));
        System.out.println(checkGoodBadPoorNum(0));
        System.out.println(checkGoodBadPoorNum(22));

//        Test Data:
//        ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
//     */
        printTaskNUmber(8);                                           //3, 4, 5, 6, 7, -> min=3, max =7 avg = 5
        System.out.println(Arrays.toString(getMinMaxAve(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 6)));
        System.out.println(Arrays.toString(getMinMaxAve(new int[]{5, 1, 6, 2, 4, 8, 7, 3}, 2, 6)));
        //6, 2, 4, 8, 7,-> min=2, max =8 avg = 6

//        Test Data:
//        {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
//        {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
//        {1, 2, 4, 5, 89}, {8, 9, 45} → {}
        printTaskNUmber(9);
        System.out.println(Arrays.toString(getIntersection(new int[]{1, 2, 4, 5, 89}, new int[]{8, 9, 4, 2})));
        System.out.println(Arrays.toString(getIntersection(new int[]{1, 2, 4, 5, 8, 9}, new int[]{8, 9, -4, -2})));
        System.out.println(Arrays.toString(getIntersection(new int[]{1, 2, 4, 5, 89}, new int[]{8, 9, 45})));


//        Test Data:
//        {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
        printTaskNUmber(10);
        System.out.println(Arrays.toString(getPeakElement(new int[]{3, 2, 7, 5, 1, 9, 23, 1})));


//        Test Data:
//        {2, 7, 3, 10} → {10, 3, 7, 2}
        printTaskNUmber(11);
        System.out.println(Arrays.toString(getReverseArray(new int[]{2, 7, 3, 10})));

//        Test Data:
//        {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
        printTaskNUmber(12);
        System.out.println(Arrays.toString(sortArrayDesc(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12})));
        printTaskNUmber(12);
        System.out.println(Arrays.toString(sortArrayAsc(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12})));


//        Test Data:
//        ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
        printTaskNUmber(13);
        System.out.println(getKthLargest(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12}, 3));
        System.out.println(getKthLargest(new int[]{2, 3, 5, 0, 1}, 2));
        //        (12 и 12 - первый и второй самые большие элементы)*/
        printSubparagraphNumber(13, "2");
        System.out.println(Arrays.toString(getKthLargest_2(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12})));
        System.out.println(Arrays.toString(getKthLargest_2(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 13})));


//        Test Data:
//        {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
        printTaskNUmber(13);
        System.out.println(Arrays.toString(getNegativeOnTheRight(new int[]{4, -3, 7, -12, 5, -2, 9, 4, 12})));


//        Test Data:
//        ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
        printTaskNUmber(14);
        System.out.println(Arrays.deepToString(getSumOfTwo(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)));


//        Test Data:
//        {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
//        {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}
        printTaskNUmber(15);
        System.out.println(Arrays.deepToString(getNumberOccurrences(new int[]{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1})));
        printTaskNUmber(15);
        System.out.println(Arrays.deepToString(sortDoubleArr(new int[][]{{3, 4}, {2, 4}, {5, 4}, {1, 4}, {4, 3}})));
    }
}

