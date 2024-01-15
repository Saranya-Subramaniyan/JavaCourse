package org.javaCourse.OOPS.abstraction.abstractClass;

public abstract class Food {
    String type;

    public Food(String type) {
        this.type = type;
    }

    abstract void menu();
    public void type(){
        if(type.equals("NonVeg")){
            System.out.println("Non veg");
        }
        else
            System.out.println("Veg");


    }

}
