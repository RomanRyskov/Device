package Transport;
import java.util.Comparator;

public class speedCamparator implements Comparator<Transport>{

    @Override
    public int compare(Transport s1, Transport s2) {
        return s1.getSpeed();
    }
}
