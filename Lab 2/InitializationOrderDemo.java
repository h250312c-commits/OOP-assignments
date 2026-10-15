public class InitializationOrderDemo {
    static {
        System.out.println("Static block 1");
    }

    static {
        System.out.println("Static block 2");
    }

    {
        System.out.println("Instance block 1");
    }

    {
        System.out.println("Instance block 2");
    }

    public InitializationOrderDemo() {
        System.out.println("Constructor");
    }

    /** Demonstrates static vs instance initialization order. */
    public static void main(String[] args) {
        System.out.println("Creating first instance:");
        new InitializationOrderDemo();
        System.out.println("\nCreating second instance:");
        new InitializationOrderDemo();
    }
}
