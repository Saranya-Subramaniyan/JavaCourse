package org.javaCourse.staticKeyword;

class Mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
}
public class staticVariable {
    public static void main(String[] args) {
        Mobile mobile=new Mobile();
        mobile.brand="Apple";
        mobile.price=10444;
        Mobile.name="SmartPhone";//common for all the object use static
         mobile.show();

        Mobile mobile2=new Mobile();
        mobile2.brand="Samsung";
        mobile2.price=10000;
//        mobile2.name="wel";
        mobile2.show();

    }
}
