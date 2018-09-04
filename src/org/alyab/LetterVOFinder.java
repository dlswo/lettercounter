package org.alyab;

public class LetterVOFinder {
        LetterVO[] vos;

    public LetterVOFinder() {
        this.vos = new LetterVO[26];
        for (int i = 0; i < 26 ; i++) {
            char ch = (char)(i + 65);
            this.vos[i] = new LetterVO(ch);
        }
    }

    public LetterVO findByChar(char ch) {
        LetterVO result = null;

        int value = (int)ch;

        result = this.vos[value - 65];

        return result;
    }

//    public static void main(String[] args) {
//        LetterVOFinder finder = new LetterVOFinder();
//        LetterVO vo = finder.findByChar('A');
//        System.out.println(vo);
//    }





}
