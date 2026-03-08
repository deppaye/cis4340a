public class R08_VNA02_J {

    // Non-compliant version
    static final class FlagNonCompliant {
        private boolean flag = true;

        public void toggle() {  // Unsafe
            flag = !flag;
        }

        public boolean getFlag() { // Unsafe
            return flag;
        }
    }

    // Compliant version
    static final class Flag {
        private boolean flag = true;

        public synchronized void toggle() {
            flag ^= true; // Same as flag = !flag
        }

        public synchronized boolean getFlag() {
            return flag;
        }
    }
}