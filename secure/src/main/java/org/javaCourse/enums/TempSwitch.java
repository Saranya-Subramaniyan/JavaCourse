package org.javaCourse.enums;

public class TempSwitch {
    public static void main(String[] args) {
    Temp t=Temp.HIGH;
        switch(t){
            case LOW -> System.out.println(Temp.LOW);
            case MEDIUM -> System.out.println(Temp.MEDIUM);
            case HIGH -> System.out.println(Temp.HIGH);
        }
        System.out.println("***************");
        for(Temp temp:Temp.values()){
            System.out.println(temp);
        }
    }
}
