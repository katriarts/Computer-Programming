package paticodes;

public class PatiCodes {

    public static void main(String[] ImCrying){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the number of dimension: ");
        int dim = sc.nextInt();

        System.out.println("Enter dimension sizes: ");
        int[] UB = new int[dim];

        for (int i = 0; i < UB.length; i++) {
            System.out.print(i + 1 + " Array UB: ");
            UB[i] = sc.nextInt();

        }
        System.out.println("What Address to find?: ");
        int[] x = new int[dim];

        for (int i = 0; i < x.length; i++) {
            System.out.print("Address " + i + ": ");
            x[i] = sc.nextInt();

        }
        int p = 1;
        for (int k = 0; k < dim; k++) {
            p *= UB[k];
        }

        System.out.println("Total number of Elements: " + p);
        
        
        System.out.print("Enter Alpha: ");
        int alpha = sc.nextInt();
        
        System.out.print("Enter esize: ");
        int esize = sc.nextInt();
        
        int bytes = 0;
        int answer;

        for (int h = 0; h < dim; h++) {

            int t = 1;
            for (int l = h + 1; l < dim; l++) {
                t *= UB[l];
            }
            bytes += x[h] * t;
        }
        answer = alpha + (bytes * esize);

        System.out.println("Address is: " + answer);

    }

}   
       



>RECORDS<

package records1;

import java.util.Scanner;
public class Records1 {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//entering the dimensions of the array
		System.out.print("Enter Database Dimensions: ");
		int dimen = sc.nextInt();
		
		//initialize variables
		int [] upperBounds = new int[dimen]; //array for the upper bounds
		int [] index = new int[dimen]; //array for the search indexes
		int totalElems = 1; //starts at one because we'll multiply it later with the upper bounds
		
		//entering the upper bounds of each dimension
		System.out.println();
		for(int i = 0; i < dimen; i++){
			System.out.print("Enter UB"+(i+1)+": ");
			upperBounds[i] = sc.nextInt();
			totalElems *= upperBounds[i]; //Computing the total number of elements. N = UB1 * UB2 * ... * UBn
		}
                System.out.println("Enter Number of Fields");
                int numFields = sc.nextInt();
                
                String []name = new String[numFields];
                int []length = new int[numFields];
                String []dataType = new String[numFields];
                
                int []byteSize = new int[numFields];
                int esizeRecords = 0;
                		
                sc.nextLine();
                for(int i = 0; i < numFields; i++){
			System.out.print("FIELD "+(i+1)+" NAME: ");
			name[i] = sc.nextLine();
			System.out.print("FIELD "+(i+1)+" LENGTH: ");
			length[i] = sc.nextInt();
                        sc.nextLine();
			System.out.print("FIELD "+(i+1)+" DATATYPE: ");
			dataType[i] = sc.nextLine();
						
			switch (dataType[i]) {
                case "char":
                    byteSize[i] = length[i]*1;
                    break;
                case "int":
                case "short":
                    byteSize[i] = length[i]*2;
                    break;
                case "long":
                case "float":
                    byteSize[i] = length[i]*4;
                case "double":
                    byteSize[i] = length[i]*8;
                        }
			System.out.println("\nData Field "+name[i]+" is "+byteSize[i]+" bytes in size.");
                        System.out.println("\n ");
                }
         System.out.print("Enter Starting Address: ");
         int address = sc.nextInt();
                         int Esize = 0;
         for(int i = 0; i < numFields; i++){
             Esize = Esize + byteSize[i];
         }
		System.out.println("Esize per Record: " + Esize); //input esize
                System.out.println("Your Database can hold: " + numberOfElements(upperBounds)+" records");
		System.out.println("Your Database consumes " + (numberOfElements(upperBounds)*Esize)+" bytes of memory space."); //display the computed total number of elements
		
		System.out.println("\n***SEARCH FOR MEMORY ADDRESS OF ith ELEMENT***\n");
                
		//entering search indexes of each dimension         for(int c = 0; c < dimension; c++){
         for(int c = 0; c < dimen; c++){
             System.out.print("Input search index at dimension "+(c+1)+": ");
             index[c] = sc.nextInt();
         }
         sc.nextLine();
         System.out.print("Input field name to search in the record: ");
         String fieldname = sc.nextLine();
         double byter = 0; 
         for(int i = 0; i < numFields; i++){
             if(!fieldname.equals(name[i])){
               byter += byteSize[i];
            }
             else{
                 break;
             }
         }
         
         double result = (getAddress(upperBounds, index, address, Esize)+byter);
         //System.out.println("Memory Address: "+(memoryAddress(UBarr, INDarr, address, Esize)));
         System.out.println("The address of this record's "+fieldname+" is located at: "+result);
                
	
        }
        static int numberOfElements(int[] UBarr){
            int NumberElements=1;
            for(int b = 0; b <UBarr.length;b++){
                NumberElements = NumberElements*UBarr[b];
            }
            return(NumberElements);
        }
	static int getAddress(int[] upperBounds, int[]index, int base, int esize){
		int dimen = upperBounds.length; //used to limit where the for loop will stop
		int address = 0; 
		
		//formula: (i0 * UB1 * UB2 * ... UBn + i1 * UB2 * UB3 * ... UBn + ... + in-1 * UBn + in) * esize + base
		// where, i0 is the value of index zero
		// and UB is the upper bounds
		for(int i = 0; i < dimen; i++){
			int temp = index[i]; 
			for(int j = i+1; j < dimen; j++){
				temp *= upperBounds[j];
			}
			address += temp;
		}
		address = address * esize + base;
		return address;
	}

}
