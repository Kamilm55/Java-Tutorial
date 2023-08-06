public class ExampleClass {
    @DeprecatedMethod(message = "Use newMethod() instead.")
    public void deprecatedMethod() {
        // Deprecated method implementation
        System.out.println("This method is deprecated and should not be used.");
    }

    public void newMethod() {
        // New method implementation
        System.out.println("This is the new method.");
    }
}