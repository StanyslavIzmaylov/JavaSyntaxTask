package com.javarush.task.pro.task17.task1715;

import java.util.ArrayList;
import java.util.List;

/* 
Вилларибо и Виллабаджо.
*/

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
                Organ organ = new Organ();
                orchestra.add(organ);
                Piano piano1 = new Piano();
                orchestra.add(piano1);
                Piano piano2 = new Piano();
                orchestra.add(piano2);
                Piano piano3 = new Piano();
                orchestra.add(piano3);
            }



    public static void createStringedOrchestra() {
                Violin violin = new Violin();
                orchestra.add(violin);
                Violin violin1 = new Violin();
                orchestra.add(violin1);
                Guitar guitar = new Guitar();
                orchestra.add(guitar);

            }



    public static void playOrchestra() {
        for (Object instrumString : orchestra) {
            if (instrumString instanceof MusicalInstrument)
            {
                ((MusicalInstrument) instrumString).play();
            }
        }
    }
}
