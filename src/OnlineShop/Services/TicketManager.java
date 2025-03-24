package OnlineShop.Services;

import OnlineShop.Model.Ticket;
import OnlineShop.Enum.TicketType;

import java.util.*;

public class TicketManager {
    private List<Ticket> soldTickets = new ArrayList<>();


    public void sellTicket(String name, TicketType type) {
        soldTickets.add(new Ticket(name, type));
    }

    public void printAllSales() {
        System.out.println(soldTickets);
    }

    public Map<TicketType, Long> countByType() {
        Map<TicketType, Long> countByType = new HashMap<>();
        long count = 1L;
        for (Ticket soldTicket : soldTickets) {
            countByType().putIfAbsent(soldTicket.getType(), count);
            countByType().put(soldTicket.getType(), countByType().get(soldTicket.getType()) + 1);
        }
        return countByType();
    }

    public int totalRevenue(){
        int profit = 0;
        for(Ticket soldTicket : soldTickets){
            profit += soldTicket.getType().getPrice();
        }
        return profit;
    }

    public Set<String> getVIPBuyers(){
     Set<String> vipBuyers = new HashSet<>();
     for(Ticket soldTicket : soldTickets){
         if(soldTicket.getType() == TicketType.VIP) {
             vipBuyers.add(soldTicket.getBuyerName());
         };
     }
     return vipBuyers;
    }

}
