package com.demo.day2.assignment1;

public class Crypto {


    public String encryptString(String text,
                                int shiftValue,
                                int groupValue){
        String result = null;

        result = normalizeText(text);
        System.out.println("Normalized Text : " + result);
        result = obifyString(result);
        System.out.println("OBified Text " + result);

        result = caesarifyString(result, shiftValue);
        System.out.println("Caesarified Text " + result);
        result = groupifyString(result, groupValue);
        return result;
    }
    public String normalizeText(String text) {
        // Replace all the characters with empty string except alphabets
        text = text.replaceAll("[^a-zA-Z]", "");
        //Convert to upper case

        return text.toUpperCase();
    }

    public String obifyString(String text) {
       return obifyTextUsingSwitchCase (text);
    }

    public String obifyTextUsingForIf (String text){
        String result = "";

        for (int i=0; i<text.length(); i++){
            if ((text.charAt(i) == 'A')||
                    (text.charAt(i) == 'E') ||
                    (text.charAt(i) == 'I') ||
                    (text.charAt(i) == 'O') ||
                    (text.charAt(i) == 'U')){
                result += "OB";
            }
            result += text.charAt(i);
        }
        return result;
    }

    public String obifyTextUsingSwitchCase (String text){
        String result = "";

        for (int i=0; i<text.length(); i++) {
            switch (text.charAt(i)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    result += "OB";
                default:
                    result += text.charAt(i);
            }
        }
        return result;
    }
    public String obifyTextUsingForEachArray (String text){
        String result = "";

        Character[] vowels = {'A', 'E', 'I', 'O', 'U'};
        // Iterate char by char
        for (int i = 0; i < text.length(); i ++) {
            // Iterate vowel in vowels array
            for (char vowel :  vowels){
                //compare with the char in vowels array
                if (text.charAt(i) == vowel) {
                    result += "OB"; //Insert OB infront
                    break;
                }
            }
            result  +=text.charAt(i);
        }
        return result;
    }


    public String obifyTextUsingRegEx (String text){
        //Replace "A, E, I, O, U" by 'OBA, OBE, OBI, OBO, OBU'

        text = text.replaceAll("O", "OBO");
        text = text.replaceAll("A", "OBA");
        text = text.replaceAll("E", "OBE");
        text = text.replaceAll("I", "OBI");
        text = text.replaceAll("U", "OBU");

        return text;
    }

    public String caesarifyString(String text,
                                int shiftValue) {
        String result = "";
        int charAscii = -1;
        // Iterate char by char
        for (int i = 0; i < text.length(); i ++) {
            charAscii = text.charAt(i) + shiftValue;

            // compare with upper boundary (Z) and minus 26
            if (charAscii > 90 )
                charAscii -= 26;
            // compare with lower boundary (A) and plus 26
            else if (charAscii < 65)
                charAscii += 26;

            result  += (char) charAscii;
        }
        return result;
    }

    public String groupifyString(String text,
                                int groupValue) {
        String result = "";
        int remainder;

        // Identify & patch the missing characters in the last group

        remainder = text.length() % groupValue; //Results the number of characters
                                                // in the last group

        while (remainder < groupValue){
            text +="x"; //Patch it with 'x'
            remainder++;
        }

        //Take sub string based on the group value
        for (int i = 0; i <text.length(); i+=groupValue) {
            result += text.substring(i, i+groupValue) + " ";
        }
        return result;

    }
}

