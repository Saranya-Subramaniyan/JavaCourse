package org.javaCourse.accessModifier.withinPackage;
//within package and outside package for sub class
class Protected{
    protected int a=10;
}
public class ProtectedMain {
    protected int abc=19;

    public static void main(String[] args) {
        Protected protect=new Protected();
        protect.a=10;
    }
}
