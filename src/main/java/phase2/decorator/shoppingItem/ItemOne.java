package phase2.decorator.shoppingItem;

public class ItemOne extends IShoppingItem {

    @Override
    public void description() {
        System.out.println("Item one is added to basket.");
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
