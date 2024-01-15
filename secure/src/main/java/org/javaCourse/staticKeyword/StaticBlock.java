package org.javaCourse.staticKeyword;

class Phone{
    static String name;
    String brand;
    int price;
Phone(){
    System.out.println("constructor");
    brand="hey";
    price=3000;
}
static {
    System.out.println("static");
    name="samsung";
}
    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }

}
public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        Phone ph = new Phone();
        ph.show();

        //for load class without create object
        Class.forName("org.javaCourse.staticKeyword.Phone");
    }

}