/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        int m = 0;
        if (n%2 == 0) {
            m= n/2;
        } else if ((n%2 == 1) && (n!=1)) {
            m= 3 * n + 1;
        } else if (n<0) {
            System.out.println("Error: n must be positive integers");
        }
        return m;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

