package ua.edu.ucu.apps.task1;

public class Banknote50 extends Banknote {

    private static final int BANKNOTE_NOMINAL = 50;

    private Banknote nextItem;
    
    public Banknote50(Banknote nextItem) {
        super(nextItem, BANKNOTE_NOMINAL);
    }

    public Banknote50() {
        super(null, BANKNOTE_NOMINAL);
    }
}
