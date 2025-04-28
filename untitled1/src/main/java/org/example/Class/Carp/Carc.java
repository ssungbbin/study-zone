package org.example.Class.Carp;

import java.util.Scanner;

public class Carc {
    public static void main(String[] args) {
        Carr c1 = new Carr("A");
        Carr c2 = new Carr("B");


        int finishline = 100;
        int round = 1;
        boolean raceover = false;


        while (!raceover) {
            System.out.println(round+"라운드");

            c1.accelerate();
            c1.move();


            c2.accelerate();
            c2.move();

            if(c1.getDistance() > finishline) {
                System.out.println(c1.getName()+"가 우승");
                raceover = true;
            }else if(c2.getDistance() > finishline) {
                System.out.println(c2.getName()+"가 우승");
                raceover = true;
            }

            round++;


        }
    }
}
