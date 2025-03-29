package org.example;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);


       System.out.println("첫번째 정수를 입력하세요:");
       int a = sc.nextInt();
       System.out.println("두번째 정수를 입력하세요:");
       int b = sc.nextInt();

       Calculator calculator = new Calculator();

       System.out.println("a와 b의 값은:"+calculataor.plus(a,b));
       System.out.println("a와 b의 값은:"+calculataor .minus(a,b));
       System.out.println("a와 b의 값은:"+calculataor .multiply(a,b));
       System.out.println("a와 b의 값은:"+calculataor .divide(a,b));
    }
}