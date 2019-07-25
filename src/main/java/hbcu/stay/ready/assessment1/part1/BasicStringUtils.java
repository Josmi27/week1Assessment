package hbcu.stay.ready.assessment1.part1;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {


        String[] stringedArray = str.split(" ");
        String solution = "";
        for (int i = 0; i < stringedArray.length; i++) {
            char curr = stringedArray[i].toUpperCase().charAt(0);
            solution += curr + stringedArray[i].substring(1) + " ";
        }
        return  solution.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder Reversed = new StringBuilder();
        Reversed.append(str);
        String newStr = Reversed.reverse().toString();
        return newStr;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {

        // Add all words into a stringed array
        String[] stringed = str.split(" ");
        String sol = "";

        // Iterate through string
        for (int i = 0; i < stringed.length; i++){

            // Create an instance of StringBuilder, because it has a reverse function
            StringBuilder sb = new StringBuilder();

            // Add the string that you want to reverse to the instance
            sb.append(stringed[i]);

            // Reverse the string, then convert it into a string
            String rev = sb.reverse().toString();

            // Save the solution into the sol variable, added by a space
            sol += rev + " ";
        }
        // Trim will delete the trailing space that is at the end
        return sol.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        // Step 1: Reverse position of words in String
        String[] reverseWordPosition = str.split(" ");
        ArrayList<String> step1 = new ArrayList<String>();

        for(int i = reverseWordPosition.length-1; i > -1; i--) {
            step1.add(reverseWordPosition[i]);
        }
        System.out.println(step1);

        // Step 2: Reverse each word in the newly reversed String
        String nearSolution = "";
        for(int i = 0; i < step1.size();i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(step1.get(i));
            nearSolution += sb.reverse().toString() + " ";
        }

        nearSolution = nearSolution.trim();
        System.out.println(nearSolution);
        // Step 3: Capitalize first letter of each word in the newly reversed String

        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String sol = str.substring(1,str.length()-1);
        return sol;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String answer = "";
        for (int i = 0; i < str.length();i++) {
            char currLetter = str.charAt(i);
            if(str.charAt(i) == str.substring(i,i+1).toUpperCase()) {
                
            }
        }
        return answer;
    }
}
