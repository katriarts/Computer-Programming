
package pkgswitch;

/**
 *
 * @author User
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Before Switch: ");
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        
        System.out.println("After switch: ");
        System.out.println("x = "+ y);
        System.out.println("y = "+ x);
    }
    
}
