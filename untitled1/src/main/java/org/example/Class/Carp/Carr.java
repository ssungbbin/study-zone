package org.example.Class.Carp;

public class Carr {
    private String name;
    private int speed;
    private int distance;

    public Carr(String name) {
        this.name = name;
        this.speed = 0;
        this.distance = 0;
    }



    public void accelerate() {
        this.speed =(int) (Math.random()*100)+1;

    }
    public void move(){
        this.distance += this.speed;

    }
    public int getDistance() {
        return this.distance;
    }
    public int getSpeed() {
        return this.speed;
    }
    public String getName() {
        return this.name;
    }


}

