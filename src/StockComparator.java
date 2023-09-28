import playerpackage.player;

import java.util.Comparator;

public class StockComparator implements Comparator<player> {

    // override the compare() method


    @Override
    public int compare(player o1, player o2) {
        if (o1.getScore() > o2.getScore())
            return -1;
        return 1;
    }
}
