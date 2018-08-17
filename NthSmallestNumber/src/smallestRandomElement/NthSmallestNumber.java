// Author: Angcon Podder
// Created: June 13th, 2018
// Objective: Finding the Nth Smallest Number from 500 Random generated numbers

package smallestRandomElement;

import java.util.Arrays;
import java.util.Scanner;

public class NthSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput;
		int[] elementArray = new int[500];
		generateRandomNum(elementArray);
		
		System.out.println("This Program generated 500 random numbers. You can find the Nth Samllest Number.");
		
		do{
            System.out.print("Please enter a number between 1 and 500: ");
            Scanner sc = new Scanner(System.in);
            userInput   = sc.nextInt();                 
        }while(userInput < 1 || userInput > 500);
		
		Arrays.sort(elementArray);
		
		System.out.println("Nth [N=" + userInput + "] smallest element number: " + elementArray[userInput-1] );
		

	}
	
	public static void generateRandomNum (int[] elementArray){
        for(int i=0; i < elementArray.length; i++){
        	elementArray[i] = (int) (Math.random() * 999);  
        }
    }

}
