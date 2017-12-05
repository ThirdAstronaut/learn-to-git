package functionalInterface;

public class DoableOverrideImpl implements Doable {
    @Override
    public void doStuff() {
        System.out.print("DoableOverrideImpl here");
    }

    @Override
    public void printHello() {
        System.out.print("print hello from DoableOverrideImpl here");
    }
}
