package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 hudson millar
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
