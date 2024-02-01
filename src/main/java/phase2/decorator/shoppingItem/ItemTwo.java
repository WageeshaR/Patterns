package phase2.decorator.shoppingItem;

public class ItemTwo extends IShoppingItem {

    @Override
    public void description() {
        System.out.println("Item two is added to basket.");
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
