package org.javaCourse.innerClass;

class AnonymousOuter{
    public void show(){
        System.out.println("out a show");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        AnonymousOuter anonymousOuter=new AnonymousOuter(){
            @Override
            public void show() {
                System.out.println("in a show");
            }
        };
        anonymousOuter.show();
    }
}
