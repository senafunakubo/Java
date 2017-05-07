package com.example.java;

public class Main {

    public static void main(String[] args) {
     // A character is a primitive data type, and it consists of just a single character.

        //single quote
        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        System.out.println("Char 1: " + c1);
        System.out.println("Char 2: " + c2);
        System.out.println("Char 3: " + c3);

    //You can also declare a character using a literal that's a Unicode escape sequence.
        char dollarSign = '\u0024';
        System.out.println("Currency: " + dollarSign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

        // If you set it as a primitive, it won't have any methods of its own,
        // but you can use the character class's methods to manipulate and otherwise manage it.


     // A string is a complex object, and can consist of many characters.
    }

}
