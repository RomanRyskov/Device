package OnlineShop;

import OnlineShop.Enum.DayOfWeek;
import OnlineShop.Enum.TicketType;
import OnlineShop.Services.DiscountManager;
import OnlineShop.Services.TicketManager;

import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TicketManager manager = new TicketManager();
        DiscountManager discountManager = new DiscountManager();

        manager.sellTicket("Аня", TicketType.STUDENT);
        manager.sellTicket("Олег", TicketType.VIP);
        manager.sellTicket("Вика", TicketType.STANDARD);
        manager.sellTicket("Олег", TicketType.VIP);
        manager.sellTicket("Аня", TicketType.STANDARD);

        manager.printAllSales();

        System.out.println("\nКоличество проданных билетов по типам:");
        Map<TicketType, Long> typeCounts = manager.countByType();
        for (Map.Entry<TicketType, Long> entry : typeCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        System.out.println("\nОбщая выручка: " + manager.totalRevenue() + "₽");

        System.out.println("\nПокупатели VIP-билетов:");
        Set<String> vipBuyers = manager.getVIPBuyers();
        for (String name : vipBuyers) {
            System.out.println(name);
        }
        System.out.println(discountManager.getDiscountedPrice(TicketType.STANDARD, DayOfWeek.SUNDAY));
        System.out.println(discountManager.getAllDiscountedPrice(DayOfWeek.SUNDAY));
    }
}
