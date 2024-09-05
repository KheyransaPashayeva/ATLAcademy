package lesson41;

import java.util.Comparator;

public class PlayerScoreAscComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        return Integer.compare(p2.getScore(), p1.getScore());
    }
}
