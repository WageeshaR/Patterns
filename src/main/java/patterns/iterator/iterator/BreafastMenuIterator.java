package patterns.iterator.iterator;

import patterns.iterator.menu.MenuItem;

import java.util.Iterator;
import java.util.List;

public class BreafastMenuIterator implements Iterator<MenuItem> {
    private List<MenuItem> items;
    private int pointer;

    public BreafastMenuIterator(List<MenuItem> list) {
        this.items = list;
        this.pointer = 0;
    }

    @Override
    public boolean hasNext() {
        return items.size() > pointer;
    }

    @Override
    public MenuItem next() {
        return items.get(pointer++);
    }
}
