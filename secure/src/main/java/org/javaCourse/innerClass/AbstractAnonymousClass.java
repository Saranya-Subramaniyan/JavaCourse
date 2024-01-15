package org.javaCourse.innerClass;

abstract class A{
    public abstract void show();
}
public class AbstractAnonymousClass {
    public static void main(String[] args) {
A obj=new A(){
    @Override
    public void show() {
        System.out.println("showwww");
    }
};
obj.show();
    }
}
