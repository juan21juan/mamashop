package com.spring.react.gori.stylah.utils;

public class TextUtils {

    private TextUtils(){}

    public static TextUtils getInstance(){
        return new TextUtils();
    }

    public String getSentenceCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        boolean next = false;
        int index = 0;
        for(char c : str.toCharArray()) {
            if (index == 0) {
                c = Character.toTitleCase(c);
                index++;
            } else if (Character.isSpaceChar(c)) {
                next = true;
            } else if (next) {
                c = Character.toTitleCase(c);
                next = false;
            } else {
                c = Character.toLowerCase(c);
            }
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
