public class Main {
    public static void main(String[] args) {
        // Get Java version
        String JavaVersion = System.getProperty("java.version");
        System.out.println(JavaVersion);
        // Get the current JDK location (JAVA_HOME)
        String javaHome = System.getProperty("java.home");
        System.out.println("Java Home: " + javaHome);
        // Get JDK vendor information
        String javaVendor = System.getProperty("java.vendor");
        System.out.println("Java Vendor: " + javaVendor);
        // More details about the Runtime environment
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Available processors (cores): " + runtime.availableProcessors());
        System.out.println("Max memory (bytes): " + runtime.maxMemory());
    }
}
