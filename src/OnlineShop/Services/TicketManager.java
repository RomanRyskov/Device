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
        Map<TicketType, Long> countType = new HashMap<>();
        long count = 0;
        for (Ticket soldTicket : soldTickets) {
            countType.putIfAbsent(soldTicket.getType(), count);
            countType.put(soldTicket.getType(), countType.get(soldTicket.getType()) + 1);
        }
        return countType;
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
