public class BreakContinueDemo {

/* continue skips the rest of the innermost loop of the current iternation, but continues to the next iterations of the innermost loop */
/* break breaks the innermost loop, does not execute the rest innermost loop, and does not execute the rest iterations of the innermost loop. */
    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

        for (int i = 0; i < a.length; i += 1) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(a[i]);
                if (a[i].contains("horse")) {
                    break; /* or use continue here */
                }                
            System.out.println("Test");
			}
			
        }
    }
}