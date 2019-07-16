package hbcu.stay.ready.assessment1.part1;

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


//        String[] stringedArray = str.split(" ");
//
//        for (int i = 0; i < stringedArray.length; i++) {
//            stringedArray[i] = "" + stringedArray[i].toUpperCase().charAt(0);
//        }
//
//        StringJoiner NewString = new StringJoiner(" ");
//        for (String element : stringedArray) {
//            NewString.add(element);
//        }
//
//        String answer = NewString.toString();
//
//        System.out.println(stringedArray);
//        return stringedArray[0];
        return  null;
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

        String[] stringedArray = str.split(" ");
        String reversed = "";

        for (int i = 0; i < stringedArray.length; i++) {
            stringedArray[i] = "" + stringedArray[i].substring(0,1).toUpperCase();
            reversed += stringedArray[i].replaceAll("s", "S");
        }

        String answer = "";
        StringBuilder Reversed = new StringBuilder();
        Reversed.append(str);
        for (int x = 0; x < Reversed.length(); x++) {
//            answer += "" + Reversed[x].reverse();
        }
        return reversed;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {


        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String answer = "";
        for (int x = 0; x < str.length(); x++) {
            if (str.charAt(x) == str.toUpperCase().charAt(x)) {
                str.toLowerCase().charAt(x);
                answer += str.charAt(x);
                continue;
            }

            if (str.charAt(x) == str.toLowerCase().charAt(x)) {
                str.toUpperCase().charAt(x);
                answer += str.charAt(x);
                continue;
            }

            continue;
        }
        return answer;
    }
}
