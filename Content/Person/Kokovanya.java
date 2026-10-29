package Content.Person;

import Content.PerformanceParams;
import Content.Abstract.CapacityLimitException;
import Content.Abstract.Person;
import Content.Item.DefaultItem;
import Content.Item.Sled;

public class Kokovanya extends Person{
    public Kokovanya(String name) {
        super(name);
    }

    @Override 
    public void performaceMove(PerformanceParams params, int step) {
        switch (step) {
            case 1:
                System.out.println("- Ладно, возьму. Только, чур, в лесу не реветь и домой до времени не проситься.");
                break;
            case 2:
                Sled sled = new Sled();
                DefaultItem crackers = DefaultItem.random("мешок сухарей",1,5);
                DefaultItem supplies = new DefaultItem("охотничий припас",1);
                try {
                    this.addItem(sled);
                    System.out.println("Взял "+this.describe()+" "+sled.describe()+".");
                    sled.addItem(crackers);
                    sled.addItem(supplies);
                    System.out.println("И положил в них "+crackers.describe()+", "+supplies.describe());
                } catch (CapacityLimitException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                break;
        }
    }
}
