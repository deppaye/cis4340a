// Non-compliant
class Super {
    protected void doLogic() {
        System.out.println("Super invoked");
    }
}

public class R06_MET04_J extends Super {

    public void doLogic() {
        System.out.println("Sub invoked");
        // Do sensitive operations
    }

    public static void main(String[] args) {
        R06_MET04_J obj = new R06_MET04_J();
        obj.doLogic();
    }
}


// Compliant
class SuperFixed {
    protected final void doLogic() { // Declare as final
        System.out.println("Super invoked");
        // Do sensitive operations
    }
}
