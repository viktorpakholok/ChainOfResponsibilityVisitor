package ua.edu.ucu.apps.task1;

public class Banknote5 extends Banknote {

    private static final int BANKNOTE_NOMINAL = 5;

    private Banknote nextItem;
    
    public Banknote5(Banknote nextItem) {
        super(nextItem, BANKNOTE_NOMINAL);
    }

    public Banknote5() {
        super(null, BANKNOTE_NOMINAL);
    }
}
