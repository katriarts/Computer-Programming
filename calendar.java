package magic;

public class Magic {
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter an odd number: ");
        int x = sc.nextInt();
        if ((x%2) == 0 ) {
            System.out.println("INVALID INPUT!");
        } else if (x == 1){
            System.out.println("INVALID INPUT!");
        } else {
            magic(x);
        }
        System.out.println(" ");
        System.out.println("Wanna try again? <y/n>");
        char a = sc.next().charAt(0);
        anadawan(a);
        System.out.println(" ");
    }            
    
    public static void magic(int x){
        System.out.println(" ");
        System.out.println("note: " + x + "x" + x + " table");
             int square[][] = new int[x + 2][x + 2];
        int i = 1, j = (x / 2) + 1;
        for (int m = 1; m <= Math.pow(x, 2); m++) {
            square[i][j] = m;
            if (i - 1 < 1) {
                i = x;
            } else {
                i = i - 1;
            }
            if (j + 1 > x) {
                j = 1;
            } else {
                j = j + 1;
            }
            if (square[i][j] != 0) {
                i = i + 1;
                j = j - 1;
                if (i > x) {
                    i = 1;
                }
                if (j < 1) {
                    j = x;
                }
                i++;
            }
        }
        System.out.println(" ");
        for (int k = 1; k <= x; k++) {
            for (int l = 1; l <= x; l++) {
                System.out.printf("%5s", square[k][l] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Sum of each row or column: "+x*(x*x+1)/2);

    }
    
    public static void anadawan(char a){
        if(a == 'y'){
            main(null);
        } else {
            System.out.println(" ");
            System.out.print("Have a nice day!");
        }
    }
}
