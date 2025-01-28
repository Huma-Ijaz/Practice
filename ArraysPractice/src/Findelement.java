import java.util.Scanner;

public class Findelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt(); // To declare and initalize the size
        int[] num = new int[size]; // To form array

        //to take number from input (initalizing the num)
        for (int i = 0; i < size; i++) {
            System.out.print("Enter num values: ");
            num[i] = sc.nextInt();

        }
        System.out.print("Enter value of x : ");
        int x = sc.nextInt();

        //for output
        for (int i = 0; i < size; i++) {
            if (num[i] == x) {
                System.out.println("Found element at index:" + i);

            }
        }
    }
}