package Singleton;

// This pattern is particularly useful when exactly one object is needed to coordinate actions across the system.
// Why we need Singleton:
//Resource Management: When you want to manage a single resource, such as a configuration manager, logging service, or database connection pool.
public class SingletonMain {
    public static void main(String[] args) {
//        ConfigurationManager c3 = new ConfigurationManager();
        // this is forbidden

        // Demonstrate the use of ConfigurationManager
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configManager2 = ConfigurationManager.getInstance();

//        // Both instances should be the same
//        System.out.println("configManager1 == configManager2: " + (configManager1 == configManager2));
//
//        // Initial value
//        System.out.println(configManager1.getInitialValue() + "\n" + configManager2.getInitialValue());
//        // change only config 2 info
//        configManager2.updateInstanceValue("Change in config 2 only ");
//
//        //Both value changed
//        System.out.println(configManager1.getInitialValue() + "\n" + configManager2.getInitialValue());

        // Demonstrate the use of configuration methods
        configManager1.readConfiguration();
        configManager2.updateConfiguration(" 2 ,");

        configManager1.readConfiguration();
        configManager2.readConfiguration();

        //
        configManager1.readConfiguration();
        configManager2.updateConfiguration(" 2 change again ,");

        configManager1.readConfiguration();
        configManager2.readConfiguration();

        //
        configManager1.readConfiguration();
        configManager2.updateConfiguration(" 1 change ");

        configManager1.readConfiguration();
        configManager2.readConfiguration();
    }
}
