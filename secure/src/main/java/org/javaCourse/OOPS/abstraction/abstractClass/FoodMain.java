package org.javaCourse.OOPS.abstraction.abstractClass;

public class FoodMain {
    public static void main(String[] args) {
        Food food;
        food=new NonVeg("NonVeg");
        food.menu();
        food.type();
        food=new Veg("Veg");
        food.menu();
        food.type();

    }
}
