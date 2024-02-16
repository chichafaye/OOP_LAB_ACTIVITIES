
package com.mycompany.act1_2;

import java.util.Scanner;

public class ACT1_2 {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        String message = inputData.nextLine();
        System.out.print("Enter the message: ");
        misplaced(message);
    }
    public static void misplaced(String message) {
        boolean misplaced = false;
        
        for(int i=1; i<message.length();i++) {
            char current=message.charAt(i);
            char prev=message.charAt(i-1);
            if(Character.isUpperCase(current)){
            if(!Character.isWhitespace(prev)){
                misplaced=true;
                break;
            }
        }
        }
        if(misplaced){
            System.out.println("JEJE!");
        } else{
            System.out.println("uWu");
        }
    }
}
