
public class UsePackage {

    public static void main(String[] args) {
        Package p1 = new Package(2, 'A');
        Package p2 = new Package(16, 'T');
        Package p3 = new Package(23, 'M');
        
        InsuredPackage ip1 = new InsuredPackage(5,'M');
        InsuredPackage ip2 = new InsuredPackage(10,'T');
        InsuredPackage ip3 = new InsuredPackage(20,'A');
        
            System.out.println(p1.display());
            System.out.println(p2.display());
            System.out.println(p3.display());
            System.out.println("______________________________ \n");
            System.out.println(ip1.display());
            System.out.println(ip2.display());
            System.out.println(ip3.display());
        
        
    }
    
}
