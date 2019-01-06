        
package randomnumber;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;
public class RandomNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        int numGuesses = 0;
        int randomNumber = new Random().nextInt(10) + 1;

        out.print("Enter an int from 1 to 10: ");
        int inputNumber = sc.nextInt();
        numGuesses++;
        
        while (inputNumber != randomNumber){
            out.println();
            out.println(" Try Again ");
            out.print(" Enter an int from 1 to 10: ");
            inputNumber = sc.nextInt();
            numGuesses++;
        } 
            out.println(" You Wn after ");
            out.println(numGuesses + " guesses ");
            
        
        out.println ("Thank You for Playing.");
        
        sc.close();
        
    }
    
}
