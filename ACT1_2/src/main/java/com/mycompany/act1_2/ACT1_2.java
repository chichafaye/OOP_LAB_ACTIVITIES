package com.mycompany.act1_2;

import java.util.Scanner;


public class ACT1_2 {

    public static void main(String[] args) {
      Scanner var = new Scanner(System.in);
      
      System.out.print("Enter the message: ");
      String message = var.nextLine();
      misplaced(message);
    }
    
    public static void misplaced(String message) {
      boolean misplaced = false;
      
      for(int m=1;m<message.length();m++){
          char currentChar = message.charAt(m);
          char beforeChar = message.charAt(m-1);
          
          if(Character.isUpperCase(currentChar)){
              if(!Character.isWhitespace(beforeChar)){
                  misplaced = true;
                  break;
              }
          }
      }
      if(misplaced){
          System.out.println("JEJE!");
      }else{
          System.out.println("uWu");
      }
    }
}
