package com.bayamp.stringUtils;

/**
 * Created by Nithin on 2/4/16.
 */
public class stringExamples {

    public static void main(String[] args){
        //Reverse a string
        reverseString("1234");
    }

    public static void reverseString(String string){

        System.out.println("Input: " + string);
        StringBuilder temp = new StringBuilder();

        temp.append(string);
        temp=temp.reverse();

        System.out.print("Reverse: ");
        for (int i=0;i<temp.length();i++){
            System.out.print(temp.charAt(i));
        }
    }
}
