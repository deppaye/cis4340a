// Non-Compliant
public class R02_EXP05_J {

    public static void main(String[] args) {

        int number = 17;
        int threshold = 10;

        // Bad precedence and side effects
        number = (number > threshold ? 0 : -2)
                + ((31 * ++number) * (number = get()));

        if (number == 0) {
            System.out.println("Access granted");
        } else {
            System.out.println("Denied access"); // number = -2
        }

        // --- Compliant Example ---
        number = 17;

        final int authnum = get();
        number = ((31 * (number + 1)) * authnum) + (authnum > threshold ? 0 : -2);

        if (number == 0) {
            System.out.println("Access granted (compliant)");
        } else {
            System.out.println("Denied access (compliant)");
        }
    }

    public static int get() {
        int number = 0;
        // Assign number to nonzero value if authorized, else 0
        return number;
    }
}
