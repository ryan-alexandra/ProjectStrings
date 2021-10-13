package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Write a sentence: ");
        Scanner sentence = new Scanner(System.in);
        String example = sentence.nextLine();
        int length= example.split(" ").length;
        int stringLength= example.length();
        int stringLengthWithoutSpaces= example.replace(" ", "").length();
        System.out.println("There are " + stringLengthWithoutSpaces +" letters in this sentence");
        System.out.println("Your sentence is  "+ length + " words long!!!!");

    }
}
