package com.austin;

import java.util.*;

public class Solution {

    public static void main(String[] args){
        /**
         * Test passwords, some that include digits, some that include uppercase chars
         */
        new Solution().doSomething("a0B0a");    // 1
        new Solution().doSomething("a0nUaB0a"); // 4
        new Solution().doSomething("101");      // -1
        new Solution().doSomething("aaca");     // -1
    }

    public int doSomething(String myString) {
        String subString = "";
        ArrayList<Integer> myCount = new ArrayList<Integer>();

        /**
         * Created upperCase variable to switch if it is validated - otherwise, will return -1
         */
        boolean upperCase = false;

        /**
         * Loop through each character of the string that is passed in
         */
        for (int i = 0; i < myString.length(); i++){

            // if character is a digit, add the current substrings length to the ArrayList, and reset the substring
            if (Character.isDigit(myString.charAt(i))) {
                myCount.add(subString.length());
                subString = "";
                // if the character is uppercase, set upperCase to true and add the character to the substring
            } else if (Character.isUpperCase(myString.charAt(i))) {
                subString += myString.charAt(i);
                upperCase = true;
                // if the character is lowercase, add the character to the substring
            } else if (Character.isLowerCase(myString.charAt(i))) {
                subString += myString.charAt(i);
            }
        }

        /**
         * If the upperCase variable was never set to true, no upperCase char exists, so return -1
         * If myCount is empty, then no lowercase or uppercase chars existed in the initial string, so return -1
         */
        if (upperCase == false || myCount.isEmpty()) {
            return -1;
            // a substring existed, so return the longest substring
        } else {
            return Collections.max(myCount);
        }
    }
}
