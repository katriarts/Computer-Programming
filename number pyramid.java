
package numberpyramid;
import java.io.*;
public class NumberPyramid {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ENTER A NUMBER: ");
        int m = Integer.parseInt(br.readLine());
        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= (m - i) *2; j++){
                System.out.print("   ");
            }
            for (int k = i; k >= 1; k--){
                System.out.printf("%5d ", k );
            }
            for (int s = 2; s <= i; s++){
                System.out.printf( "%5d ", s);
            }
            System.out.println("  ");
        }
    }
    
}
