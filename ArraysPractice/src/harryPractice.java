import java.util.Scanner;

public class harryPractice {
    public static void main(String[]args){
        //Q#1 Create array of 5 floats and take their sum
//        float arr[] = {5.5f , 4.0f,3.5f ,6.8f, 2.5f };
//        float sum = 0;
//
//        for (int i=0; i<5 ; i++){
//            sum += arr[i];
//        }
//        System.out.print("Sum of array is:" + sum);


        //Q#2 Find an element
//        int arr[] = {4,3,2,1,7};
//        int found = 0;
//        System.out.print("Enter value of x:");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//            for (int i=0; i < 5 ; i++ ) {
//                if (arr[i] ==x){
//                    found = 1;
//                }
//            }
//            if(found==1){
//                System.out.print("Element Found ");
//            }
//            else{
//                System.out.print("Element Not Found");
//            }

        //Sum of two matrices
        int mat1[][] ={{5,4}, {3,2}};
        int mat2[][] ={{6,4}, {3,5}};
        int resultmat[][]= new int[2][2];

       for(int i = 0 ; i <2; i++){
           for (int j = 0; j<2; j++ ){
                resultmat[i][j] = mat1[i][j] + mat2[i][j];
                System.out.println( resultmat[i][j]);
           }
           System.out.println(); // To move to nextline
       }







    }
}
