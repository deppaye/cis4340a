// Non-compliant
public class R01_DCL00_J {
    private final int balance;
    private static final R01_DCL00_J c = new R01_DCL00_J();
    private static final int deposit = (int) (Math.random() * 100); // Random deposit

    public R01_DCL00_J() {
        balance = deposit - 10; // Subtract processing fee
    }

    public static void main(String[] args) {
        System.out.println("The account balance is: " + c.balance);
    }
}


// Compliant
class R01_DCL00_J_Fixed {
    private final int balance;
    private static final int deposit = (int) (Math.random() * 100); // Random deposit
    private static final R01_DCL00_J_Fixed c = new R01_DCL00_J_Fixed(); // Correct initialization order

    public R01_DCL00_J_Fixed() {
        balance = deposit - 10; // Subtract processing fee
    }

    public static void main(String[] args) {
        System.out.println("The account balance is: " + c.balance);
    }
}
