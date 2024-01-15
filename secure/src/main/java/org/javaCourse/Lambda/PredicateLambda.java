package org.javaCourse.Lambda;

import java.util.function.IntPredicate;

public class PredicateLambda {
    public static void main(String[] args) {
        IntPredicate lessThan18=value-> value<18;
        IntPredicate greaterThan18=value-> value>18;
        System.out.println(lessThan18.or(greaterThan18).test(10));
        System.out.println(lessThan18.and(greaterThan18).test(10));


    }
}
