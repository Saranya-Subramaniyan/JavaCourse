package org.javaCourse.FinalBlock;
class Animal{
    public final int i;

    public Animal(int i) {
        this.i = i;
    }

}
public class FinalVariable {
    public static void main(String[] args) {
   Animal animal=new Animal(7);
        System.out.println(animal.i);
        Animal animal2=new Animal(16);
        System.out.println(animal2.i);

    }
}
