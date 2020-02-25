/*
 * Andrew Thompson
 * February 24, 2020
 * converts an input to morse code
 */
package morsecode;

/**
 *
 * @author tiein
 */

import javax.swing.JOptionPane;

public class MorseCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variable declaration
        String input;
        String output = "";
        //array with all alphabetic Morse code strings in order
        String[] morseLetters = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
            ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        //array with all numeric Morse code string in order from 0-9
        String[] morseNumbers = {"-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};
        
        try{
            //get user input
            input = JOptionPane.showInputDialog("Enter the phrase you would like to be converted to Morse code");
            input = input.toUpperCase();
            
            //iterate through all characters, and only change them to Morse if they are a letter or number
            for(int i = 0; i < input.length(); i++){
                if(Character.isAlphabetic(input.charAt(i))){
                    output += morseLetters[input.charAt(i)-65];
                    output += " ";
                }else if(Character.isDigit(input.charAt(i))){
                    output += morseNumbers[input.charAt(i)-48];
                    output += " ";
                }
            }
            
            //output to user
            JOptionPane.showMessageDialog(null, "The original message was: " + input + "\nThe message in Morse code is: " + output);
        }catch(NullPointerException npe){
            System.exit(0);
        }
    }
    
}
