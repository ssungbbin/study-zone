package com.ohgiraffers.section04.scanner;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) { //숫자를 입력하여 그 숫자의 구구단을 만드는 프로그램
        Scanner scr =  new Scanner(System.in);
        System.out.print("구구단을 출력하고 싶은 숫자를 입력하세요 : ");
        int num = scr.nextInt();

        Gugu gugudan = new Gugu();
        gugudan.dan(num);




    }
}
