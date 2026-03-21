class ExceptionDemo {

    // Method using throws
    static void checkNumber(int num) throws Exception {
        if (num < 0) {
            throw new Exception("Number cannot be negative"); // throw keyword
        } else {
            System.out.println("Number is valid: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // causes ArithmeticException
            System.out.println("Result: " + result);
            checkNumber(-5);
        } catch (ArithmeticException e) { // catch
            System.out.println("Arithmetic Exception: Division by zero");

        } catch (Exception e) {
            System.out.println("Custom Exception: " + e.getMessage());

        } finally { // finally block
            System.out.println("Finally block executed");
        }
    }
}