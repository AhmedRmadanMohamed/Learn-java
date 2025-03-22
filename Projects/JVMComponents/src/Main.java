
public class Main {
    public static void main(String[] args) {
        // Get Java version
        String JavaVersion = System.getProperty("java.version");
        System.out.println(JavaVersion);
        // Get JDK vendor information
        String javaVendor = System.getProperty("java.vendor");
        System.out.println("Java Vendor: " + javaVendor);
        // Classpath (Libraries and classes)
        String Classpath =System.getProperty("java.class.path");
        System.out.println("Classpath: " + Classpath);
        //Java Runtime Environment directory
        String javaHome = System.getProperty("java.home");
        System.out.println("Java Home: " + javaHome);
        // Java Virtual Machine info
        String VirtualMachineName = System.getProperty("java.vm.name");
        System.out.println("Virtual Machine: " + VirtualMachineName);
        // Java Virtual Machine version
        String VirtualMachineversion = System.getProperty("java.vm.version");
        System.out.println("Virtual Machine version: " + VirtualMachineversion);

        //1- Java Compiler (javac)
        String javac =System.getProperty("java.compiler");
        System.out.println("Java Compiler: " + javac);
        // 2- Run ClassLoader
        Class<?> x = Main.class;
        System.out.println(x.getClassLoader());
        // 3-Memory Area
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Available processors (cores): " + runtime.availableProcessors());
        System.out.println("Max memory (bytes): " + runtime.maxMemory());
        System.out.println("Total memory (bytes): " + runtime.totalMemory());
        System.out.println("Free memory (bytes): " + runtime.freeMemory());

        //4-JIT Compiler
        String JIT = System.getProperty("java.compiler");
        System.out.println("JIT Compiler info :  " + JIT);





    }
}