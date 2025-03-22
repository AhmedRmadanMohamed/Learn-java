import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Get the JRE path
        String javaHome = System.getProperty("java.home");

        // Typically, jar file is located in the following path
        File jarTool = new File(javaHome + File.separator + "bin" + File.separator + "jar.exe");

        // Check if jar.exe file exists (on Windows)
        if(jarTool.exists()) {
            System.out.println("JAR Tool path: " + jarTool.getAbsolutePath());
        } else {
            System.out.println("JAR tool not found in JRE, checking JDK parent directory...");

            // If jar file is not found in JRE, it might be in the parent JDK directory (common structure)
            File possibleJDKJar = new File(javaHome + File.separator + ".." + File.separator + "bin" + File.separator + "jar.exe");
            if(possibleJDKJar.exists()) {
                System.out.println("JAR Tool path (from JDK): " + possibleJDKJar.getAbsolutePath());
            } else {
                System.out.println("JAR Tool not found.");
            }
        }



    }
}
