package functionalInterface;

/**
 * @FunctionalInterface can have only one public method like @Runnable, @Callable
 * But it also can have default methods
 */
@FunctionalInterface
public interface Doable {
    void doStuff();
    default void printHello(){
        System.out.print("Hello");
    }
}
