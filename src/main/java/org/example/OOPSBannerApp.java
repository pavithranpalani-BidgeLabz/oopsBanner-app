package org.example;

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {
    static HashMap<Character,String[]> createMap(){
        HashMap<Character,String[]> charMap = new HashMap<>();
        charMap.put('O',new String[]{
                "   ******    ",
                " **      **  ",
                "**        ** ",
                "**        ** ",
                "**        ** ",
                " **      **  ",
                "   ******    "});
        charMap.put('P',new String[]{
                " ********    ",
                " **      **  ",
                " **      **  ",
                " ********    ",
                " **          ",
                " **          ",
                " **          "
        });
        charMap.put('S',new String[]{
                "   ******    ",
                " **      **  ",
                " **          ",
                "   ******    ",
                "          ** ",
                " **      **  ",
                "   ******    "
        });
        return  charMap;
    }

    public static void displayBanner(HashMap<Character,String[]> charMap,String message ){
        for(int i=0;i<7;i++){
            StringBuilder builder = new StringBuilder();
            for(char c:message.toCharArray()){
                if(charMap.containsKey(c)){
                    builder.append(charMap.get(c)[i]);
                }
            }
            System.out.println(builder.toString());
        }
    }
    public static void main(String[] args) {
        HashMap<Character,String[]> charMap = createMap();
        String str="OOPS";
        displayBanner(charMap,str);
    }
}