package patterns.iterator.iterator;

import patterns.iterator.menu.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] items;
    private int pointer;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
        this.pointer = 0;
    }

    @Override
    public boolean hasNext() {
        return this.items[pointer] != null;
    }

    @Override
    public MenuItem next() {
        return this.items[pointer++];
    }
}
