package org.example;

public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] ar={
                String.join(" ", "   ******    ", "   ******    ", " ********   ", "   ******   "),
                String.join(" ", " **      **  ", " **      **  ", " **      **  ", " **      **  "),
                String.join(" ", "**        ** ", "**        ** ", " **      **  ", " **          "),
                String.join(" ", "**        ** ", "**        ** ", " ********    ", "   ******    "),
                String.join(" ", "**        ** ", "**        ** ", " **          ", "          ** "),
                String.join(" ", " **      **  ", " **      **  ", " **          ", " **      **  "),
                String.join(" ", "   ******    ", "   ******    ", " **          ", "   ******    ")
        };
        for(String s:ar){
            System.out.println(s);
        }

    }
}