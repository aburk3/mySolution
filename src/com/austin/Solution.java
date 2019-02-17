package com.austin;

import java.util.*;

public class Solution {

    public static void main(String[] args){
        new Solution().doSomething("a0B0a");    // 1
        new Solution().doSomething("a0nUaB0a"); // 4
        new Solution().doSomething("101");      // -1
        new Solution().doSomething("aaca");     // -1
    }

    public int doSomething(String myString) {
        String subString = "";
        ArrayList<Integer> myCount = new ArrayList<Integer>();

        boolean upperCase = false;
        boolean number = false;

        for (int i = 0; i < myString.length(); i++){
            if (Character.isDigit(myString.charAt(i))) {
                myCount.add(subString.length());
                subString = "";
            } else if (Character.isUpperCase(myString.charAt(i))) {
                subString += myString.charAt(i);
                upperCase = true;
            } else if (Character.isLowerCase(myString.charAt(i))) {
                subString += myString.charAt(i);
            }

        }


        if (upperCase == false || myCount.isEmpty()) {
            System.out.println("-1");
            return -1;
        } else {
            System.out.println(Collections.max(myCount));
            return Collections.max(myCount);
        }
    }
}
