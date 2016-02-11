package com.bayamp.stringUtils;

/**
 * Created by Nithin on 2/9/16.
 */
public class stringUtils {

    //reverse string using StringBuilder
    public static void reverseStringSB(String string){

        System.out.println("Input: " + string);
        StringBuilder temp = new StringBuilder();

        temp.append(string);
        temp=temp.reverse();

        System.out.print("Reverse: ");
        for(int i=0;i<temp.length();i++){
            System.out.print(temp.charAt(i));
        }
    }

    //reverse string using toCharArray
    public static void reverseStringTCA(String string){
        System.out.println("Input: " + string);

        char[] temp = string.toCharArray();
        int length = temp.length;

        System.out.print("Reverse: ");
        while(length >= 0)
        {
            System.out.print(temp[length]);
            length = - 1;
        }

    }

    //reverse string using recursion
    public static void reverseStringRecur(String string){
        System.out.println("Input: " + string);

        System.out.print("Reverse: " + stringUtils.reverseRecusion(string));
    }

    private static String reverseRecusion(String s){
        if (s.length() == 0)
            return s;

        return reverseRecusion(s.substring(1)) + s.charAt(0);

    }
    //length of string without using length
    public static void lengthOfString(String temp)
    {
        int x = 0;

        for(char c : temp.toCharArray()){
            x = + 1;
        }

        System.out.println("Length of string " + temp + " : " + x);
    }


}
