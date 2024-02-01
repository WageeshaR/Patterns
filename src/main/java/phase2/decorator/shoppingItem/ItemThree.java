package phase2.decorator.shoppingItem;

public class ItemThree extends IShoppingItem {

    @Override
    public void description() {
        System.out.println("Item three is added to basket.");
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
