package OnlineShop.Services;

import OnlineShop.Enum.DayOfWeek;
import OnlineShop.Enum.TicketType;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class DiscountManager {
    EnumMap<DayOfWeek, Integer> priceOfDay = new EnumMap<>(DayOfWeek.class);

    public DiscountManager() {
      priceOfDay.put(DayOfWeek.MONDAY, DayOfWeek.MONDAY.getDiscountPercent());
      priceOfDay.put(DayOfWeek.THURSDAY, DayOfWeek.TUESDAY.getDiscountPercent());
      priceOfDay.put(DayOfWeek.WEDNESDAY, DayOfWeek.WEDNESDAY.getDiscountPercent());
      priceOfDay.put(DayOfWeek.TUESDAY, DayOfWeek.TUESDAY.getDiscountPercent());
      priceOfDay.put(DayOfWeek.FRIDAY, DayOfWeek.FRIDAY.getDiscountPercent());
      priceOfDay.put(DayOfWeek.SATURDAY, DayOfWeek.SATURDAY.getDiscountPercent());
      priceOfDay.put(DayOfWeek.SUNDAY, DayOfWeek.SUNDAY.getDiscountPercent());
    }

    public int getDiscountedPrice(TicketType type, DayOfWeek day){
        int discountedPrice;
        discountedPrice = type.getPrice() * day.getDiscountPercent();
        return discountedPrice;
    }
    public Map<TicketType, Integer> getAllDiscountedPrice(DayOfWeek day){
        return null;
    }
}
