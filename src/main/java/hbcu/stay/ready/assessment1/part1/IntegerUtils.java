package hbcu.stay.ready.assessment1.part1;


/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String answer = "";
        String StringedVal = "" + val;
        for (int x = StringedVal.length(); x >= 1; x--) {
            answer += x;
        }
        Integer response = Integer.valueOf(answer);
        return response;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        if(val%2 == 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}

