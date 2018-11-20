
package bubblesort;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int x = 100;
        
        int temp = 0;
        for (int i = 0; i < x; i++){
            for (int j = 1; j < (x); j++){
                if (arr[j - 1] > arr[j]){
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2 , 4 , 6 , 8 , 10 , 1 , 3 , 5 , 7 , 9 , 11 , 13 , 15 , 17 , 19 , 12 , 14 , 16 , 18 , 20,
                    22 , 24, 26 , 28 , 30 , 21 , 23 , 25 , 27 , 29 , 31 , 33 , 35 , 37 , 39 , 32 , 34 , 36 , 38 , 40,
                    42 , 44 , 46 , 48 , 50 , 41 , 43 , 45 , 47 , 49 , 51 , 53 , 55 , 57 , 59 , 52 , 54 , 56 , 58 , 60,
                    61 , 70 , 62 , 69 , 63 , 68 , 64 , 67 , 65 , 66 , 71 , 80 , 72 , 79 , 73 , 78 , 74 , 77 , 75 , 76,
                    81 , 90 , 82 , 89 , 83 , 88 , 84 , 87 , 85 , 86 , 91 , 96 , 92 , 99 , 93 , 98 , 94 , 97 , 95 , 100}; 
        
        System.out.println("ARRAY BEFORE BUBBLE SORT: ");
        for (int i = 0; i < 100; i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("ARRAY AFETR BUBBLE SORT: ");
        for (int i = 0; i < 100; i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }
    
}
