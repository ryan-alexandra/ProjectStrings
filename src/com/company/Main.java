package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Write a sentence: ");
        Scanner sentence = new Scanner(System.in);
        String example = sentence.nextLine();
        int length= example.split(" ").length;
        System.out.println("Your sentence is  "+ length + " words long!!!!");
    }
}
