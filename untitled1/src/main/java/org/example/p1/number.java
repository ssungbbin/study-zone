package org.example.p1;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("주민번호 입력:");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();

        for(int i = 8; i < ch.length; i++) {

                ch[i]= '*';

        }
        System.out.println(ch);

    }
}














