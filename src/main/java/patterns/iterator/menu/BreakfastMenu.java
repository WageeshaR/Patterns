package patterns.iterator.menu;

import patterns.iterator.iterator.BreafastMenuIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BreakfastMenu implements Menu<List<MenuItem>> {
    private List<MenuItem> menuItems;

    public BreakfastMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menuItems.add(item);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> getIterator() {
        return new BreafastMenuIterator(this.menuItems);
    }
}
