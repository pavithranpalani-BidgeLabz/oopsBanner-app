package org.example;

public class OOPSBannerApp {

    public static String[] getOpattern(){
        return new String[]{
                "   ******    ",
                " **      **  ",
                "**        ** ",
                "**        ** ",
                "**        ** ",
                " **      **  ",
                "   ******    "
        };
    }
    public static String[] getPpatter(){
        return new String[]{
                " ********    ",
                " **      **  ",
                " **      **  ",
                " ********    ",
                " **          ",
                " **          ",
                " **          "
        };
    }

    public static String[] getSpattern(){
        return new String[]{
                "   ******    ",
                " **      **  ",
                " **          ",
                "   ******    ",
                "          ** ",
                " **      **  ",
                "   ******    "
        };
    }
    public static void main(String[] args) {
        String[] Opattern=getOpattern();

        for(int i=0;i<Opattern.length;i++){
            System.out.println(Opattern[i]+" "+Opattern[i]+" "+getPpatter()[i]+" "+getSpattern()[i]);
        }

    }
}