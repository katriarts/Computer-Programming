package complement;

public class Complement {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter Minuend: ");
        int x = sc.nextInt(); 
       System.out.println("Enter Subtrahend: ");
        int y = sc.nextInt(); 
        String z = String.format("%09d",y);
        String temp = z;
        String finans = "";
        int[] number = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            number[i] = temp.charAt(i) - '0';
            switch (number[i]) {
                case 0:
                    number[i] = 9;
                    break;
                case 1:
                    number[i] = 8;
                    break;
                case 2:
                    number[i] = 7;
                    break;
                case 3:
                    number[i] = 6;
                    break;
                case 4:
                    number[i] = 5;
                    break;
                case 5:
                    number[i] = 4;
                    break;
                case 6:
                    number[i] = 3;
                    break;
                case 7:
                    number[i] = 2;
                    break;
                case 8:
                    number[i] = 1;
                    break;
                case 9:
                    number[i] = 0;
                    break;
            }
            finans = finans + number[i];
        }
        int sol = Integer.parseInt(finans);
        y = sol + 1;
        int alm = x + y;
        int lastNumber = alm;
        String ans = Integer.toString(lastNumber);
        System.out.println("______________________");
        int lastans = Integer.parseInt(ans.substring(2));
        System.out.println("Answer: "+lastans);
    }
    
}
