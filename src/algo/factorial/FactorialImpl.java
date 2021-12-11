package algo.factorial;

public class FactorialImpl {

    /*
     * Algorithm: Factorial
     * 0!                                   = 1
     * 1!   = 1 * 1           = 1 * 0!      = 1
     * 2!   = 2 * 1           = 2 * 1!      = 2
     * 3!   = 3 * 2 * 1       = 3 * 2!      = 6
     * 4!   = 4 * 3 * 2 * 1   = 4 * 3!      = 24
     * */
    protected int factorial(int num) {
        return num > 0 ? num * factorial(num - 1) : 1;
    }

    public static void main(String[] args) {
        FactorialImpl factorial = new FactorialImpl();
        System.out.println(factorial.factorial(0));
        System.out.println(factorial.factorial(1));
        System.out.println(factorial.factorial(2));
        System.out.println(factorial.factorial(3));
        System.out.println(factorial.factorial(4));
    }

}
