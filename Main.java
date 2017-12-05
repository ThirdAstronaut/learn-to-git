package functionalInterface;

public class Main{
    public static void main(String... args){
        doThings(new Doable() {
            @Override
            public void doStuff() {
                System.out.print("Work is done here");
            }
        });

        Doable one = DoableFactory.create(DoableImpl::new);
        Doable two = DoableFactory.create(DoableOverrideImpl::new);

    }
    public static void doThings(Doable doable){
        doable.doStuff();

    }
}
