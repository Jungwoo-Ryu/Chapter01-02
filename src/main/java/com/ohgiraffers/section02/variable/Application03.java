package com.ohgiraffers.section02.variable;

import com.sun.jdi.connect.Connector;

public class Application03 {
    public static void main(String[] args) {
        // Goal. Naming Rule

        // Chapter. 1. Compile Error
        // Chapter. 1-1. Repetitive variable name
        int age = 20;
        // int age = 20;

        // Chapter. 1-2. Keyword
        // int true = 1;

        // Chapter. 1-3. Capitalization
        int Age = 20;

        // Chapter. 1-4. Number
        // int 1age = 20;
        int age1 = 20;

        // Chapter. 1-5. symbols
        int _age_ = 20;
        int $harp = 20;
        // int s@adad = 20;

        // Chapter. 2. Convention of naming
        // Chapter. 2-1. not too long
        // Chapter. 2-2. Camel case
        // Chapter. 2-3. not use the underscore
        String user_name;
        String userName;

        // Chapter. 2-4. prefer English
        int 나이;

        // Chapter. 2-5. name by its contents
        String s;
        String name;

        // Chapter. 2-6. use typical names
        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 1;

        // Chapter. 2-7. name by nouns
        String goHome;

        // Chapter. 2-8. positive
        boolean isAlive = true;
        boolean isDead = false;
    }
}
