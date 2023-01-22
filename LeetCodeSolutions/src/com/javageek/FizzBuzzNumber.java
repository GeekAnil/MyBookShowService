package com.javageek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzzNumber {

    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
          System.out.print("WELCOME TO JavaWorld ");
        System.out.print("Enter any number: ");
        num=input.nextInt();
        List<String> result=new ArrayList<>();

        for(int i=1;i<=num;i++){
            if(i%3==0 && i%5==0){
                result.add("FizzBuzz");}
            else if(i%3==0){
                result.add("Fizz");
            }
            else if(i%5==0){
                result.add("Buzz");
            }
            else{
                result.add(Integer.toString(i));
            }
        }
        System.out.println("Result in remote is updated now: "+result);
    }
}
