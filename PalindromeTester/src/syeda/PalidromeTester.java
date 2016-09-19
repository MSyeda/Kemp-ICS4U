package syeda;

import java.util.Scanner;

public class PalidromeTester {

/*
	@ author Maryam Syeda

Due Date: Monday, September 19, 2016

This programs tests words to see if they are palidromes.
*/
    public static boolean Palindrome(String number)

    {  

    int numberLength= number.length()-1;

    

        if(number.length() == 0 || number.length() == 1)

            return true; 

        // One or no letters means that the palindrome is true

        if(number.charAt(0) == number.charAt(numberLength))

        // Testing to see if first and last letters are the same.

        return Palindrome(number.substring(1,numberLength));

        //Returns part of word between length 1 and the numbers length. Makes the length go down by one and goes back up to the top.

        return false;

        // returns that it is not a palindrome 

    }




    public static void main(String[]args)

    { 

    boolean recall =true;

    

    while( recall ==true)

    {

    

   
//Recieves user input

       Scanner myScanner = new Scanner(System.in);

       System.out.println("Enter a number to test for a palindrome:");

       String answer = myScanner.nextLine();

       // Inputing numbers

       // If Palindrome returns true then the string is

        //palindrome otherwise it is not

        

       if(Palindrome(answer))

       {

           System.out.println("That is a palindrome");

           // palindrome true

       }

       else

       {

           System.out.println("That is not a palindrome");

           //palindrome false

       }

       System.out.println("Would you like to play again? Y or N");

       String againAnswer = myScanner.nextLine();

       if( againAnswer.equalsIgnoreCase("n"))

       {

       
recall = false;

       
// Stops Loop

       }

       else if (againAnswer.equalsIgnoreCase("y"))

       {

       
recall = true;

       
// Loop Continued

       }

  

       


    }




    }

}



