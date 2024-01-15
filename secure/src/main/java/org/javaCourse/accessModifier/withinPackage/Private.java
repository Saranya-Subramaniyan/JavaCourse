package org.javaCourse.accessModifier.withinPackage;
// private only use within the class

class Used{
    private int a=10;
}
public class Private {
    private int abc=19;

    public static void main(String[] args) {

        Used use=new Used();
        //use.a;//throws error
    }
}
