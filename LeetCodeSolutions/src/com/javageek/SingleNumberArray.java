package com.javageek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SingleNumberArray {

    public static void main(String[] args) {
        int[] numArr=new int[5];
        int singleNum=0;
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.print("Enter any number: ");
            numArr[i]= scanner.nextInt();
        }
        Arrays.stream(numArr).forEach(System.out::println);
        List<Integer> list = Arrays.stream(numArr).boxed().toList();

        for(int i=0;i<4;i++){
            for(int j=i+1;j<4;j++){
                if(list.get(i) == list.get(j)){
                    list.remove(i);
                }
            }
        }
        System.out.println(list);
    }
}
