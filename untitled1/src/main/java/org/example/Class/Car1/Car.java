package org.example.Class.Car1;

public class Car {
    private boolean isOn;
    private int speed;

    public void start(){
        if(isOn){
            System.out.println("걸려있음");
        }else{
            this.isOn = true;
            System.out.println("걸림");


        }
    }
    public void go(){
        if(isOn){
            System.out.println("움직임");
            this.speed+=10;
        }
        else{
            System.out.println("안걸림");
        }
    }
    public void stop(){
        if(isOn){
            if(this.speed>0){
                System.out.println("멈춤");

            }else{
                System.out.println("멈춰있음");

            }
        }else{
            System.out.println("멈춰있음");
        }
    }
    public void off(){
        if(isOn){
            if(this.speed>0){
                System.out.println("속도가 높음.시동안꺼짐");
            }else{
                System.out.println("시동 끄겠습니다");

            }
        }else{
            System.out.println("꺼져있음");
        }
    }


}
