package ninescomplement2;

public class Ninescomplement2 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter Minuend: ");
        int m = sc.nextInt();
        System.out.print("Enter Subtrahend: ");
        int n = sc.nextInt(); 
        String z = String.format("%09d",n);
        String temp = z;
        String res = "";
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
            if(newGuess[i] == 1){
                newGuess[i] = 8;
            } else if(newGuess[i] == 2){
                newGuess[i] = 7;
            } else if(newGuess[i] == 3){
                newGuess[i] = 6;
            } else if(newGuess[i] == 4){
                newGuess[i] = 5;
            } else if(newGuess[i] == 5){
                newGuess[i] = 4;
            } else if(newGuess[i] == 6){
                newGuess[i] = 3;
            } else if(newGuess[i] == 7){
                newGuess[i] = 2;
            } else if(newGuess[i] == 8){
                newGuess[i] = 1;
            } else if(newGuess[i] == 9){
                newGuess[i] = 0;
            } else if(newGuess[i] == 0){
                newGuess[i] = 9;
            }
            res = res + newGuess[i];
        }
        int sol = Integer.parseInt(res);
        n = sol + 1;
        int alm = m + n;
        int lastDigits = alm;
        String ans = Integer.toString(lastDigits);
        System.out.println("----------------------");
        int lastans = Integer.parseInt(ans.substring(2));
        System.out.println("Answer: " +lastans);
    }
    
}
