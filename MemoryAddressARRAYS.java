package finaladdresscalc1;
import java.util.*;
public class FinalAddressCalc1 {    
    public static void main(String[] args) {
        int i = 0;
        int val1 = 1;
        int val2 = 0;
        int esize = 0;
        int dimensions = 0;
        
        Scanner sc = new Scanner (System.in);
        String again;
        again = "yes";
        
        while(again.equalsIgnoreCase("yes")){
            try{
                dimensions = 0; esize = 0;
                while (dimensions <1){
                    System.out.print("How many dimensions will the array have?: ");
                    dimensions = sc.nextInt();
                    
                    if(dimensions <1)
                        System.out.print("\nPlease enter a valid Integer: " + (i + 1));
                }
                System.out.print("Please determine the 'esize' of the array: \n "
                        + "char = 1; int = 2; float = 4; double = 8)");
                esize = sc.nextInt();
                int[]UB = new int[dimensions];
                int[]den = new int[dimensions];
                
                System.out.print("\nWhat will the alpha be?: ");
                int alpha = sc.nextInt();
                
                for(i = 0; i<dimensions; i++){
                    System.out.print("\nPlease enter the value for the Upper Boundary " + (i + 1) + ": ");
                    UB[i] = sc.nextInt();
                }
                for(i = 0; i<dimensions; i++){
                    System.out.print("Please set the index to be located [" + i + "]:");
                    den[i] = sc.nextInt();
                }
                
                i = dimensions - 1;
                //the code for the equation
                for(int j = 1; j <=dimensions; j++){
                    val2 = val2 + den[i] * val1;
                    val1 = val1 * UB[i];
                    i--;
                }
                
                int answer = alpha + (val2 * esize);
                System.out.println("The MEMORY ADDRESS for the array is: " + answer);
                System.out.println("----------------------------------------------");
                System.out.println("Would you like to try again? (yes/no)");  
                
                
                
            }catch (Exception e){
                System.out.println("You have entered an Invalid Answer");
                System.out.println("Would you like to try again? (yes/no)");
                again=sc.next();
            }
            again=sc.next();
        }
        System.out.println("HAVE A NICE DAY!");

    }
    
}
