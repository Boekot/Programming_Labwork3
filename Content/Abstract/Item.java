package Content.Abstract;

import java.util.Objects;

public abstract class Item implements Describable{
    private final String name;
    private int amount;

    protected Item(String name, int amount) throws IllegalArgumentException{
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must be a valid string.");
        }
        this.name = name;
        if (amount < 1) {
            throw new IllegalArgumentException("Amount must be valid number.");
        }
        this.amount = amount;
    }

    protected Item(String name) {
        this(name, 1);
    }

    public final String getName() {
        return this.name;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final void setAmount(int amount) {
        this.amount = amount;
    }

    @Override 
    public String describe() {
        return this.getName()+" в количестве "+this.getAmount()+" шт.";
    }

    @Override 
    public String toString() {
        return "{Item: name="+name+", amount="+amount+"}";
    }

    @Override 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return this.getName().equals(item.getName()) && this.getAmount() == item.getAmount();
    }

    @Override 
    public int hashCode() {
        return Objects.hash(getClass(),this.getName(),this.getAmount());
    }
}
