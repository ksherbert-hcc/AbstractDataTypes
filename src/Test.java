public class Test {
    public static void main(String[] args) {
        pass();
    }

    private static void pass() {
        System.out.println("All tests pass.");
        System.exit(0);
    }
    public static void fail() {
        System.err.println("Forcing a fail to test CI failure indicator.");
        System.exit(1);
    }
}
