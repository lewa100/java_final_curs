package Domain;

public class Counter implements AutoCloseable {
    private static int startIndex = 0;
    
    public int add(){
        return ++startIndex;
    }

    @Override
    public void close() {
        System.out.println("Counter closed");
    }
}
