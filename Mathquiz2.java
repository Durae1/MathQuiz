/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;

/**
 *
 * @author lewic
 */
public class Mathclass2 {
     private final static int A = 100 ;
     
     private final static int NUM_ATTEMPTS = 3;
     
     public static void main(String[]args ){
         
         System.out.println("***Math Checker***");
         System.out.println("Compute the value of 20*5");
         
         Scanner scanner = new Scanner(System.in);
         
         int attempts = 0;
         
         
         
         while(attempts < NUM_ATTEMPTS){
             
             
             String correctAnswer = scanner.next();
             
             
             
             
             if(correctAnswer.equals(A)){
                 
                 System.out.println("That's correct! 20*5 = 100");
                 
                 break;
                 
                 
             } else {
                 
                  System.out.println("Incorrect answer try again!");
                  
                  
                  attempts = attempts + 1;
                  
                  System.out.println("Number of attempts: " + attempts);
                  System.out.println("Number of attempts allowed: " + NUM_ATTEMPTS);
                  
                  
                  if(attempts == NUM_ATTEMPTS){
                      
                      System.out.println("Sorry, you have tried too many times");
                      
                  } else {
                      System.out.println("Please try again: ");
                      
                  
                  }
                  
                  
                 
                 
             }
             
         }
         
     
         
     }
    
}
