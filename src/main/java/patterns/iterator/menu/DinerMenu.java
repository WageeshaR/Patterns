package patterns.iterator.menu;

import patterns.iterator.iterator.DinerMenuIterator;

import java.util.Iterator;

public class DinerMenu implements Menu<MenuItem[]> {
    private static final int MAX_ITEMS = 10;
    private MenuItem[] menuItems;
    private int numberOfItems = 0;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            menuItems[numberOfItems] = item;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> getIterator() {
        return new DinerMenuIterator(this.menuItems);
    }
}
