package homework_week_7_AnswersFromPrime;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Program_12_FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration gor reading input from console
        Scanner scanner = new Scanner (System.in);
        System.out.println(" Enter any character: ");
        char ch = scanner.next().charAt(0);
        //Object creation
        Program_12_FindInputValue inputValue = new Program_12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //Closing the scanner object
        scanner.close();
    }
    // Find the input value is Alphabet, Digit and Symbol
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch){
        if((ch >='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println(ch + "is an Alphabet");
        }else if(ch >='0'&& ch<='9'){
            System.out.println(ch + " is a Digit");
        }else{
            System.out.println(ch + " is a Symbol");
        }
    }
}
