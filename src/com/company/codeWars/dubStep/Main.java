package com.company.codeWars.dubStep;

public class Main {
    public static void main(String[] args){
        String song = "RWUBWUBWUBLWUB";

        song = song.replaceAll("WUB", " ");
        for(int i = 0; i<10; i++){
            song = song.replaceAll("  ", " ");
        }

        if(song.charAt(song.length()-1) == ' '){
            song = song + " ";
        }
        if(song.charAt(0) == ' '){
            song = " " + song;
        }
        song = song.replaceAll("  ", "");

        //return song.replaceAll("(WUB)+", " ").trim(); -> Better solution
    }
}
