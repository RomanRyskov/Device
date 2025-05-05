package ordering_system.service;

import ordering_system.model.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MenuService {
    private final List<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void removeMenuItem(int itemId) {
        menuItems.removeIf(item -> item.getId() == itemId);
    }

}
