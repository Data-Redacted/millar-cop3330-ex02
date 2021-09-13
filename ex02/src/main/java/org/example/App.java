package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter a word" );

        String word = scan.nextLine();
        int length = word.length();
        System.out.println( word + " has " + length + " characters");

    }
}
