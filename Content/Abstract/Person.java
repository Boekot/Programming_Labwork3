package Content.Abstract;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Person extends Participant implements Describable, Container{
    private final String name;
    private ArrayList<Item> items = new ArrayList<Item>();

    protected Person(String name) throws IllegalArgumentException{
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must be a valid string.");
        }
        this.name = name;
    }

    public final String getName() {
        return this.name;
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
    public String describe() {
        return name;
    }

    @Override 
    public String toString() {
        return "{Person: name="+this.getName()+", inventory="+items.toString()+"}";
    }

    @Override 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return this.getName().equals(person.getName()) && this.items.equals(person.items);
    }

    @Override 
    public int hashCode() {
        return Objects.hash(getClass(),this.getName(),this.items);
    }
}
