package week4;


class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    public void division(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }

    public void printLength(String str) {
        try {
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }

    public void checkNumber(int number) throws CustomException {
        if (number < 0) {
            throw new CustomException("Number is negative: " + number);
        } else {
            System.out.println("Number is positive: " + number);
        }
    }

    public static void main(String[] args) {
        ExceptionHandlingDemo demo = new ExceptionHandlingDemo();

        demo.division(10, 0);

        demo.printLength(null);

        try {
            demo.checkNumber(-5);
        } catch (CustomException e) {
            System.out.println("CustomException: " + e.getMessage());
        }
    }
}
