package com.bootcamp.assignment;

public class Crypto {
    public static void main (String[] args){
        // get user input for text, shift value groupvalue
        // call encrypt
        // print the result

        String text = "sdsg sfg? %dfg sfgsfg $^dsdgsgfgd";
        text = text.replaceAll("[^a-zA-Z]", "");
        System.out.println(text);

        // String Cancatenation
        String text1 = " Hello";
        String text2 = " World";
        String text3 = text1+text2;

        System.out.println(text3);
        System.out.println(text3.length());

        text3 = "abcxyz";
        text3 = text3.toUpperCase();
        System.out.println(text3);
        // Character shifting
        for (int i=0; i <text3.length(); i++){
            Character character = text3.charAt(i);
            int ascii = text3.charAt(i) + 3;
            Character shiftedChar = (char) ascii ;
// Add shift value to your ascii character
            System.out.println(character + " - " + ascii + " " + shiftedChar);

        }

    }

    public String encryptString(String text,
                                int shiftValue,
                                int groupValue){
        String result = null;

        result = normalizeText(text);
        result = obifyString(result);
        result = ceasrifyString(result, shiftValue);
        result = groupifyString(result, groupValue);
        return result;
    }

    public String normalizeText(String text) {
        String result = null;

        return result;
    }

    public String obifyString(String text) {
        String result = null;

        return result;
    }

    public String ceasrifyString(String text,
                                int shiftValue) {
        String result = null;

        return result;
    }

    public String groupifyString(String text,
                                int groupValue) {
        String result = null;

        return result;
    }

}

