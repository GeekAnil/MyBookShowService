package com.javageek;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurrenceInString {

    public static void main(String[] args) {
        Map<Character,Integer> charOccurMap=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter any String: ");
        String input=scanner.next();

       // System.out.println(input.toCharArray());
        for(int i=0;i<input.length();i++){
char c=input.charAt(i);
//            if(charOccurMap.containsKey(c)){
//                charOccurMap.put(c,charOccurMap.get(c)+1);
//            }
//            else{
//                charOccurMap.put(c,1);
//            }
            charOccurMap.put(c,charOccurMap.containsKey(c)?charOccurMap.get(c)+1:1);

        }

        for (Map.Entry entry : charOccurMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs from Remote  " + entry.getValue()+" times");
        }
           
            System.out.println("JavaGeek Here updated from Remote");
        
    }
}
