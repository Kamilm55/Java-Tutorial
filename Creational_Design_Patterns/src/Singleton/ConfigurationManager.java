package Singleton;

//Learn: => https://refactoring.guru/design-patterns/singleton , https://www.youtube.com/watch?v=0q5V4pjEx18&list=PLCp1YoRkzkpbgstE-aF1nV5m9r4KXs4zn&index=1

// This pattern is particularly useful when exactly one object is needed to coordinate actions across the system.
public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String initialValue = "initial value";
    private String ConfigurationText = "Default config test";

    // Private constructor to prevent external instantiation
    // if we don't specify any constructor , there is default hidden public constructor
    private ConfigurationManager() {
        // Additional initialization code can be added here
        System.out.println("ConfigurationManager instance created");
    }

    // Public method to get the instance
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Other methods for reading and managing configurations
    public void readConfiguration() {
//        System.out.println("Reading configuration...");
        // Add logic to read configuration from a file or another source
        System.out.println(ConfigurationText);
    }

    public void updateConfiguration(String configText) {
        System.out.println("Updating configuration...");
        // Add logic to update configuration

        ConfigurationText += configText; // add text every time

    }

    public void updateInstanceValue(String str){
        initialValue = str;
    }

    public String getInitialValue(){return this.initialValue;}


    // Other methods related to configuration management...


}

