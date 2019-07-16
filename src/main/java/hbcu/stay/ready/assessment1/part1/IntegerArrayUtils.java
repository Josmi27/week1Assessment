package hbcu.stay.ready.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for (int x = 0; x < intArray.length; x++) {
            sum += intArray[x];
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int sum = 1;
        for (int x = 0; x < intArray.length; x++) {
            sum *= intArray[x];
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int numElements = intArray.length;
        int sum = 0;
        for (int x = 0; x < intArray.length; x++) {
            sum += intArray[x];
        }

        double answer = sum/numElements;
        return answer;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        int max = intArray[0];
        for (int x = 0; x < intArray.length; x++) {
            if(intArray[x] > max) {
                max = intArray[x];
            }
        }
        return max;
    }
}
