public class ExceptionalHandling {
    public static void main(String[]args){
//        try {
//            int result = 10 / 2;
//        } finally {
//            System.out.println("Finally block executed.");
//
                    try {
                        // Code that may throw an exception
                        int result = 10 / 0; // This will throw an ArithmeticException
                    } finally {
                        // This block will execute regardless of an exception
                        System.out.println("This will always execute.");
                    }
                }
            }

