package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OOPSBannerApp {
    static class  CharacterPatternMap{
        private char character;
        private String[] pattern;

        public char getCharacter() {
            return character;
        }

        public void setCharacter(char character) {
            this.character = character;
        }

        public String[] getPattern() {
            return pattern;
        }

        public void setPattern(String[] pattern) {
            this.pattern = pattern;
        }

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }


    }
    public static void main(String[] args) {

        String str="OOPS";

        CharacterPatternMap[] OOPSpattern = {
                new CharacterPatternMap(
                        'O', new String[]{
                        "   ******    ",
                        " **      **  ",
                        "**        ** ",
                        "**        ** ",
                        "**        ** ",
                        " **      **  ",
                        "   ******    "
                }),new CharacterPatternMap('P',new String[]{
                " ********    ",
                " **      **  ",
                " **      **  ",
                " ********    ",
                " **          ",
                " **          ",
                " **          "
        }),new CharacterPatternMap('S',new String[]{
                "   ******    ",
                " **      **  ",
                " **          ",
                "   ******    ",
                "          ** ",
                " **      **  ",
                "   ******    "
        })
        };
        for(int i=0;i<7;i++){
            StringBuilder builder=new StringBuilder();
            for(CharacterPatternMap pattern:OOPSpattern){
                for(char ch:str.toCharArray()){
                    if(pattern.getCharacter()==ch){
                        builder.append(pattern.getPattern()[i]);
                    }
                }
            }
            System.out.println(builder.toString());
        }
    }
}