package phase2.decorator;

import phase2.decorator.shoppingItem.IShoppingItem;

public class Cart {
    
    private IShoppingItem shoppingItemDecorator;

    public Cart(IShoppingItem item) {
        this.shoppingItemDecorator = item;
    }

    public void addToCart(IShoppingItem item) {
        item.setExistingShoppingItem(shoppingItemDecorator);
        shoppingItemDecorator = item;
    }

    public Double calculateTotalPrice() {
        return shoppingItemDecorator.getPrice();
    }
}
