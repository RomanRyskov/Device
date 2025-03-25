package OnlineShop.Services;

import OnlineShop.Enum.DayOfWeek;
import OnlineShop.Enum.TicketType;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class DiscountManager {

    public int getDiscountedPrice(TicketType type, DayOfWeek day){
        int discountedPrice;
        discountedPrice = type.getPrice() -(type.getPrice() * day.getDiscountPercent()/100);
        return discountedPrice;
    }
    public Map<TicketType, Integer> getAllDiscountedPrice(DayOfWeek day){
        Map<TicketType, Integer> discountedPrice = new HashMap<>();
        for (TicketType value : TicketType.values()) {
            discountedPrice.put(value, getDiscountedPrice(value,day));
        }
        return discountedPrice;
    }
}
