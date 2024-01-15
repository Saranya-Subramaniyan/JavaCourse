package org.javaCourse.OOPS.classAndObject;
import java.lang.*;
public class Car {
    public int speed;
public String color;
private String model;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void speedCondition(){
        if(getSpeed()>0 && getSpeed()<50)
            System.out.println("normal");
        else
            System.out.println(" speed limit exist");
    }
}
