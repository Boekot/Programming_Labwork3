package Content.Person;

import Content.PerformanceParams;
import Content.Abstract.CapacityLimitException;
import Content.Abstract.Person;
import Content.Item.Bundle;
import Content.Item.DefaultItem;

public class Darenka extends Person{
    public Darenka(String name) {
        super(name);
    }

    @Override 
    public void performaceMove(PerformanceParams params, int step) {
        switch (step) {
            case 2:
                Bundle bundle = new Bundle();
                DefaultItem shreds = DefaultItem.random("лоскуточки",3,5);
                DefaultItem ballofthread = new DefaultItem("клубок ниток",1);
                DefaultItem needle = DefaultItem.random("иголка",1,2);
                DefaultItem rope = new DefaultItem("веревка",2);
                try {
                    this.addItem(bundle);
                    System.out.println("Взяла "+this.describe()+" "+bundle.describe()+".");
                    bundle.addItem(shreds);
                    bundle.addItem(ballofthread);
                    bundle.addItem(needle);
                    bundle.addItem(rope);
                    System.out.println("И уложила в него "+shreds.describe()+", "+ballofthread.describe()+", "+needle.describe()+", "+rope.describe());
                } catch (CapacityLimitException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                break;
        }
    }
}
