package hbcu.stay.ready.assessment1.part2;

import java.util.Collections;
import java.util.HashMap;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (int x = 0; x < objectArray.length; x++) {
            if(objectArray[x].equals(objectToCount)) {
                count += 1;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Object[] solution = new Object[objectArray.length];
        for (int x = 0, k = 0; x < objectArray.length; x++) {
            if(objectArray[x].equals(objectToRemove)) {
                continue;
            }
            else {
                solution[k++] = objectArray[x];
            }
            }
        return solution;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        HashMap<Object, Integer> FrequencyTracker = new HashMap<Object, Integer>();
        for (int x = 0; x < objectArray.length; x++) {
            if (FrequencyTracker.containsKey(objectArray[x])) {
                FrequencyTracker.put(objectArray[x], FrequencyTracker.get(objectArray[x]) + 1);
                FrequencyTracker.put(objectArray[x], 1);
            }
        }

        int MostFrequentOccurrenceNumber = Collections.max(FrequencyTracker.values());

        // The final step was to return the key from the calculated value. I just returned the value in order
        // to return something relevant, although incorrect.
        return MostFrequentOccurrenceNumber;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        return null;
    }
}
