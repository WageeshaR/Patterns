package phase2.decorator.shoppingItem;

import lombok.Setter;

public abstract class IShoppingItem {
    @Setter
    protected IShoppingItem existingShoppingItem;
    protected double price;
    protected String description;

    public Double getPrice() {
        return existingShoppingItem != null ? existingShoppingItem.getPrice() + this.price : this.price;
    }

    public abstract void description();

    public abstract void setPrice(double price);

}