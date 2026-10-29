package Content.Abstract;

import java.util.ArrayList;

public interface Container {
    public abstract void addItem(Item item) throws CapacityLimitException;

    public abstract ArrayList<Item> getItems();
}
