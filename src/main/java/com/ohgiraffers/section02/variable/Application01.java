package com.ohgiraffers.section02.variable;

public class Application01 {
    public static void main(String[] args) {
        // Goal. Different type of variables
        // Chapter. 1. Value
        System.out.println("===========Value=========");
        System.out.println("Salary + Bonus : "+ (100000+20000) + "원");

        int salary = 100000;
        int bonus = 20000;
        System.out.println("Salary + Bonus : " + (salary + bonus) + "원");

        // Chapter. 2. Recycling
        System.out.println("========Recycling Value=========");
        System.out.println("1000 points has been sent to c1");
        System.out.println("1000 points has been sent to c2");
        System.out.println("1000 points has been sent to c3");
        System.out.println("1000 points has been sent to c4");
        System.out.println("1000 points has been sent to c5");
        System.out.println("1000 points has been sent to c6");
        System.out.println("1000 points has been sent to c7");
        System.out.println("1000 points has been sent to c8");
        System.out.println("1000 points has been sent to c9");
        System.out.println("1000 points has been sent to c10");
        System.out.println("===============================");
        int point = 1000;
        System.out.println(point + " points has been sent to c1");
        System.out.println(point + " points has been sent to c2");
        System.out.println(point + " points has been sent to c3");
        System.out.println(point + " points has been sent to c4");
        System.out.println(point + " points has been sent to c5");
        System.out.println(point + " points has been sent to c6");
        System.out.println(point + " points has been sent to c7");
        System.out.println(point + " points has been sent to c8");
        System.out.println(point + " points has been sent to c9");
        System.out.println(point + " points has been sent to c10");

        //Chapter. 3. unstable data can be stored and used
        System.out.println("=============refactoring the data================");
        int sum = 0;
        System.out.println("First Value: " + sum);
        sum = sum + 10;
        System.out.println("Second Value: " + sum);
        sum = sum + 10;
        System.out.println("Third Value: " + sum);
    }
}
