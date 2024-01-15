package org.javaCourse.accessModifier.withinPackage;
//use everywhere
class Public{
    public int as=12;
}

public class PublicMain {
    public int abc=19;

    public static void main(String[] args) {
        Public public2=new Public();
        public2.as=10;//able to access it

        Protected protect =new Protected();
        protect.a=10;//able to access within the package
    }
}
