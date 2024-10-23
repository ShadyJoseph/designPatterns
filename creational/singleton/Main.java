package singleton;

public class Main {
    public static void main(String[] args) {
        // Get the first instance of CounterSingleton
        CounterSingleton firstInstance = CounterSingleton.getInstance();
        
        // Get the second instance of CounterSingleton
        CounterSingleton secondInstance = CounterSingleton.getInstance();

        // Increment the counter using the first instance
        firstInstance.increment();
        firstInstance.increment();

        // Increment the counter using the second instance
        secondInstance.increment();

        // Display the current count using both instances
        firstInstance.displayCount(); // Should output: Current count: 3
        secondInstance.displayCount(); // Should also output: Current count: 3

        // Verify that both instances are the same
        System.out.println("Are both instances the same? " + (firstInstance == secondInstance)); // Should output: true
    }
}
