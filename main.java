public class main {
    public static void main(String[] args) {
        int number = 5; // Change this to the number for which you want to calculate the factorial.
        long factorial = calculateeFactorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);
    }}}

    public static long calculateFactorial(int n) {
            return n * calculateFactorial(n - 1);
    }
}
