package com.javageek.exercise;

import java.util.Scanner;

public class ReverseString {

 public static void main(String[] args) {

  System.out.println("Welcome to Java World");

  try (Scanner scanner = new Scanner(System.in)) {
   System.out.print("Enter any word: ");
   String word = scanner.next();
   int revIndex = 0;
   char[] revString = new char[word.length()];

   for (int i = word.length() - 1; i >= 0; i--) {
    revString[revIndex] = word.charAt(i);
    revIndex++;
   }

   System.out.println(revString);
  }

 }

}
