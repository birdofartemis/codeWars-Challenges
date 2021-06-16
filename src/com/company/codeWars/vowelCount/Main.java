package com.company.codeWars.vowelCount;

public class Main {
    public static void main(String[] args){
        String phrase = "O Marco e o HUgo";
        System.out.println(getCount(phrase));


    }

    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}
