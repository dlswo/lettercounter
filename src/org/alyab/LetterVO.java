package org.alyab;

public class LetterVO {

    Character value;
    int count;


    public LetterVO(Character value) {
        this.value = value;
        this.count = 0;
    }

    @Override
    public String toString() {
        return "LetterVO{" +
                "value=" + value +
                ", count=" + count +
                '}';
    }


}
