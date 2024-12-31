package ua.edu.ucu.apps.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @AllArgsConstructor @NoArgsConstructor
public abstract class Banknote {

    private Banknote nextItem;
    private int banknoteNominale;

    public void process(int amount) {
        int quantity = amount / banknoteNominale;
        int rest = amount % banknoteNominale;
    
        if (nextItem != null) {
            nextItem.process(rest);     
        } else {
            if (rest != 0) {
                throw new IllegalArgumentException();
            }
        }

        System.out.format("Please recieve %d x %d\n", quantity, banknoteNominale);
           
    }
}
