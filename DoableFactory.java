package functionalInterface;

import java.util.function.Supplier;

public class DoableFactory {

    static Doable create(final Supplier<Doable> doableSupplier){
        return doableSupplier.get();
    }
}
