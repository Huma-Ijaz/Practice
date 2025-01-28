import java.util.Scanner;

public class Homework {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        String name[]= new String[size];

         // To get name of student
//        for (int i = 0 ; i < size; i++){
//            name[i] = sc.next();
//        }
//        for (int i = 0 ; i < name.length; i++){
//            System.out.println("Name " + (i+1) + " is:"+ name[i]);
//        }

         // To check ascending order of array

        int num[] = new int[size];

        //for input loop
        for (int i=0; i<size ; i++){
            num[i] = sc.nextInt();
        }
        boolean isAscending = false;
        //for output loop
        for (int i=0; i < num.length ; i++){
            if (num[i]<(i+1)){
                isAscending = true;

            }
        }
        if (isAscending==true){
            System.out.print("Array is in Ascending Order.");
        }
        else{
            System.out.print("Array is not in Ascending Order.");
        }
        //to check descending order

//        int size = sc.nextInt();
//        int num[] = new int[size];
//
//        //for input loop
//        for (int i=0; i<size ; i++){
//            num[i] = sc.nextInt();
//        }
//        boolean isAscending = true;
//        //for output loop
//        for (int i=0; i < num.length ; i++){
//            if (num[i]<(i+1)){
//                isAscending = false;
//
//            }
//        }
//        if (isAscending==false){
//            System.out.print("Array is in Descending Order.");
//        }
//        else{m.
//            System.out.print("Array is not in Descending Order.");



//                int[][] matrix = {
//                        {1, 2, 3, 4},
//                        {5, 6, 7, 8},
//                        {9, 10, 11, 12},
//                        {13, 14, 15, 16}
//                };
//
//                System.out.println("Matrix without diagonal elements:");
//                for (int i = 0; i < 4; i++) {
//                    for (int j = 0; j < 4; j++) {
//                        // Skip diagonals
//                        if (i != j) {
//                            System.out.print(matrix[i][j] + " ");
//                        } else {
//                            System.out.print("   "); // Print blank space for diagonal
//                        }
//                    }
//                    System.out.println(); // Move to the next line
                }
            }













