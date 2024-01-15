package org.javaCourse.FinalBlock;
class ParentMethod{
    public final int add(int a,int b){
        return a+b;
    }
}

class Method extends ParentMethod{
    int i;
    //cannot override the final method
//    @Override
//    public int add(int a,int b){
//        return a+b;
//    }

}
public class FinalMethod {
    public static void main(String[] args) {
        Method method=new Method();
        System.out.println( method.add(7,9));
    }
}
