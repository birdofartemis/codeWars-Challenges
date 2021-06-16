package com.company.codeWars.onesAndZeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));

    }
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int i = binary.size()-1;
        int number = 0;
        for(Integer value : binary){
            if(value == 1){
                number += Math.pow(2,i);
            }
            i--;
        }
        return number;

        //return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }
}
