package Domain;

public class Counter {
    private static int startIndex = 0;
    
    static public int add(){
        return ++startIndex;
    }
}
