package ua.edu.ucu.apps.task1;

public class Banknote100 extends Banknote {

    private static final int BANKNOTE_NOMINAL = 100;

    private Banknote nextItem;
    
    public Banknote100(Banknote nextItem) {
        super(nextItem, BANKNOTE_NOMINAL);
    }

    public Banknote100() {
        super(null, BANKNOTE_NOMINAL);
    }
}
