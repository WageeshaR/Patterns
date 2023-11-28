package patterns.iterator.menu;

import java.util.Iterator;

public interface Menu<T> {
    void addItem(String name, String description, boolean vegetarian, double price);

    T getMenuItems();

    Iterator<MenuItem> getIterator();
}
