package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OOPSBannerApp {
    public static void main(String[] args) {
        String str="OOPS";

        String O[]={
                "   ******    ",
                " **      **  ",
                "**        ** ",
                "**        ** ",
                "**        ** ",
                " **      **  ",
                "   ******    "
        };
        String[] P={
                " ********    ",
                " **      **  ",
                " **      **  ",
                " ********    ",
                " **          ",
                " **          ",
                " **          "
        };

        String[] S={
                "   ******    ",
                " **      **  ",
                " **          ",
                "   ******    ",
                "          ** ",
                " **      **  ",
                "   ******    "
        };

        for(int i=0;i<7;i++){
            for(char ch:str.toCharArray()){
                if(ch=='O'){
                    System.out.print(O[i]);
                }
                else if(ch=='P'){
                    System.out.print(P[i]);
                }
                else if(ch=='S'){
                    System.out.print(S[i]);
                }
            }
            System.out.println();
        }

    }
}