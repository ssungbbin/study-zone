package org.example.Class.Car1;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carracer racer = new Carracer();

        while(true){
            System.out.println("1.시동걸기");
            System.out.println("2.전진");
            System.out.println("3.정지");
            System.out.println("4.시동끔");
            System.out.println("9.프로그램 종료");
            System.out.println("메뉴선택");
            int choice = sc.nextInt();
            switch(choice){
                case 1: racer.start();break;
                case 2: racer.go();break;
                case 3: racer.stop();break;
                case 4: racer.off();break;
                case 9: System.out.println("종료");break;
            }
            if (choice == 9) {
                break;
            }
        }

    }
}
