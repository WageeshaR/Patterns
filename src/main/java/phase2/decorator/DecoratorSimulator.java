package phase2.decorator;

import phase2.decorator.shoppingItem.IShoppingItem;
import phase2.decorator.shoppingItem.ItemOne;
import phase2.decorator.shoppingItem.ItemThree;
import phase2.decorator.shoppingItem.ItemTwo;

public class DecoratorSimulator {
    
    public void simulate() {

        IShoppingItem item1 = new ItemOne();
        item1.setPrice(5.5);

        Cart shoppingCart = new Cart(item1);

        IShoppingItem item2 = new ItemTwo();
        item2.setPrice(11.5);

        shoppingCart.addToCart(item2);

        IShoppingItem item3 = new ItemThree();
        item3.setPrice(2.5);

        shoppingCart.addToCart(item3);

        Double total = shoppingCart.calculateTotalPrice();
        System.out.println("Total is: " + total);

    }
}
