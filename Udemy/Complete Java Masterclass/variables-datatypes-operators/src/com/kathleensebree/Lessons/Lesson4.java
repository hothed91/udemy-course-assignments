package com.kathleensebree.Lessons;

/**
 * Lesson 4: Getting to know Primitive Data Types - Char and Boolean
 */
public class Lesson4 {

  public Lesson4() {

    /**
     * char
     */
    char myChar = 'D'; //single characters
    char unicodeChar = '\u0044'; // unicode
    System.out.println(unicodeChar);

    /**
     * boolean
     */
    boolean myBoolean = true; // true or false

    /**
     * challenge 01
     *
     * 1. find the code for the registered symbol on the same line as the copyright symbol.
     * 2. Create a variable of type char and assign it the unicode value for that symbol
     * 3. display on screen.
     */
    char regisiteredSymbol = '\u00AE';
    System.out.println(regisiteredSymbol);

  }
}
