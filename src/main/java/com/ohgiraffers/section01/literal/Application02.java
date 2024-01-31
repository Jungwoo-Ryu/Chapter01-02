package com.ohgiraffers.section01.literal;

public class Application02 {
    public static void main(String[] args) {
        // Goal. computing and printing

        // Chapter. 1. Integer and Integer computation
        System.out.println("--------------Integer and Integer computation-------------");
        System.out.println(123+456);
        System.out.println(123-23);
        System.out.println(123*10);
        System.out.println(123/10);
        System.out.println(123%10);

        // Chapter. 1-2. Double and Double computation
        System.out.println("--------------Double and Double computation-------------");
        System.out.println(1.23+1.23);
        System.out.println(1.23-0.23);
        System.out.println(1.23*10.0);
        System.out.println(1.23/10.0);
        System.out.println(1.23%1.0);

        // Chapter. 1-3. Integer and Double computation
        System.out.println("--------------Integer and Double computation-------------");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);


        // Chapter. 2. Character and Character computation
        System.out.println("--------------Character and Character computation-------------");
        System.out.println('a'+'b');
        System.out.println('a'-'b');
        System.out.println('a'*'b');
        System.out.println('a'/'b');
        System.out.println('a'%'b');

        // Chapter. 2-1. Character and integer computation
        System.out.println("--------------Character and Integer computation-------------");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        // Chapter. 2-2. Character and Double computation
        System.out.println("--------------Character and Integer computation-------------");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        // Chapter. 3. String and String computation
        System.out.println("--------------String and String computation-------------");
        System.out.println("Hello "+"World");
//        System.out.println("Hello "-"World");
//        System.out.println("Hello "*"World");
//        System.out.println("Hello "/"World");
//        System.out.println("Hello "%"World");
        // Chapter. 3-1. String and other computation
        System.out.println("--------------String and Other computation-------------");
        System.out.println("Hello" + 123);
        System.out.println("Hello" + 123.456);
        System.out.println("Hello" + 'a');
        System.out.println("Hello" + true);

        // Chapter. 4. Boolean and Boolean computation
        System.out.println("--------------Boolean and Boolean computation-------------");
//        System.out.println(true + false);
//        System.out.println(true - false);
//        System.out.println(true * false);
//        System.out.println(true / false);
//        System.out.println(true % false);
        // Chapter. 4-1 Boolean and String computation
        System.out.println("--------------Boolean and String computation-------------");
        System.out.println(true+"a");
    }
}
