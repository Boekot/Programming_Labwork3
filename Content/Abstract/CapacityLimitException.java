package Content.Abstract;

public class CapacityLimitException extends Exception{
    private  Object container;
    private  Object item;

    public CapacityLimitException(ContainerItem container, Item item) {
        this.container = container;
        this.item = item;
    }

    public CapacityLimitException(Person container, Item item) {
        this.container = container;
        this.item = item;
    }

    @Override 
    public String getMessage() {
        return "Can't contain "+item+"in "+container;
    }
}
