package Content.Abstract;

import java.util.ArrayList;
import java.util.Objects;

public abstract class ContainerItem extends Item implements Container{
    private ArrayList<Item> items;

    protected ContainerItem(String name, int capacity) throws IllegalArgumentException{
        super(name);
        if (capacity < 1) {
            throw new IllegalArgumentException("Container capacity must be a valid number.");
        }
        this.items = new ArrayList<Item>(capacity);
    }

    @Override 
    public String describe() {
        return this.getName();
    }

    @Override 
    public final void addItem(Item item) throws CapacityLimitException{
        try {
            this.items.add(item);
        } catch (IndexOutOfBoundsException exception) {
            throw new CapacityLimitException(this, item);
        }
    }

    public final ArrayList<Item> getItems() {
        return this.items;
    }

    @Override 
    public String toString() {
        return "{Item: name="+this.getName()+", contains: "+items.toString()+"}";
    }

    @Override 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContainerItem containerItem = (ContainerItem) o;
        return this.getName().equals(containerItem.getName()) && this.items.equals(containerItem.items);
    }

    @Override 
    public int hashCode() {
        return Objects.hash(getClass(),this.getName(),this.items);
    }
}
