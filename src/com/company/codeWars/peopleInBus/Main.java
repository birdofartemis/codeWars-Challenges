package com.company.codeWars.peopleInBus;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});

        System.out.println(countPassengers(list));
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        int allPassengers = 0, leavingPassengers = 0;

        for(int[] values : stops){
            allPassengers += values[0];
            leavingPassengers += values[1];
        }
        return  allPassengers - leavingPassengers;
    }

    /*
    public static int countPassengers(ArrayList<int[]> stops) {
    return stops.stream().mapToInt(x -> x[0] - x[1]).sum();
  }
     */
}
