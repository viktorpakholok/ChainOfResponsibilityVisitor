package ua.edu.ucu.apps;

public class Banknote50 extends Banknote {
    private Banknote nextItem;
    
    public Banknote50(Banknote nextItem) {
        super(nextItem, 50);
    }

    public Banknote50() {
        super(null, 50);
    }
}
