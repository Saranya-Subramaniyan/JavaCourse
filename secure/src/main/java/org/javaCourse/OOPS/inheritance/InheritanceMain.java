package org.javaCourse.OOPS.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {

        Vehicle vehicle=new Vehicle();
        System.out.println(vehicle.toString());
        Bike bike=new Bike();
        System.out.println(bike.getHandle()+" "+bike);
        Truck truck=new Truck("diesel",4,6,5,"LED","xx","yyes","yes",1);
        System.out.println(truck.getEngine()+" "+truck);
    }
}
