package singleton;
public class CounterSingleton {
    // Volatile keyword ensures visibility of changes to variables across threads
    private static volatile CounterSingleton instance;

    // Counter variable
    private int count;

    // Private constructor to prevent instantiation
    private CounterSingleton() {
        count = 0; // Initialize counter
    }

    // Public method to provide access to the instance
    public static CounterSingleton getInstance() {
        if (instance == null) { // Check if instance is null
            synchronized (CounterSingleton.class) { // Synchronized block
                if (instance == null) { // Double-check locking
                    instance = new CounterSingleton();
                }
            }
        }
        return instance;
    }

    // Method to increment the counter
    public void increment() {
        count++;
    }

    // Method to get the current count
    public int getCount() {
        return count;
    }

    // Example method to display the count
    public void displayCount() {
        System.out.println("Current count: " + count);
    }
}
