package ua.edu.ucu.apps;

public class Banknote5 extends Banknote {
    private Banknote nextItem;
    
    public Banknote5(Banknote nextItem) {
        super(nextItem, 5);
    }

    public Banknote5() {
        super(null, 5);
    }
}
