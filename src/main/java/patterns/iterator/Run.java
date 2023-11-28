package patterns.iterator;

import patterns.iterator.menu.BreakfastMenu;
import patterns.iterator.menu.DinerMenu;
import patterns.iterator.menu.Menu;
import patterns.iterator.menu.MenuItem;

import java.util.Iterator;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Menu<List<MenuItem>> breakfastMenu = new BreakfastMenu();
        Menu<MenuItem[]> dinerMenu = new DinerMenu();

        List<Menu<?>> allMenus = List.of(breakfastMenu, dinerMenu);
        for (Menu<?> menu: allMenus) {
            System.out.println("Printing all menus for you...");
            Iterator<MenuItem> iterator = menu.getIterator();
            while (iterator.hasNext()) {
                MenuItem item = iterator.next();
                System.out.println(item.getName() + ", " + item.getDescription());
                System.out.println(item.getPrice() + (item.isVegetarian() ? " (veg)": ""));
            }
        }
        System.out.println("That's all we've got for you today.");
    }
}
