package ua.edu.ucu.apps;

public class Banknote100 extends Banknote {
    private Banknote nextItem;
    
    public Banknote100(Banknote nextItem) {
        super(nextItem, 100);
    }

    public Banknote100() {
        super(null, 100);
    }
}
