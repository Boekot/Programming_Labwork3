package Content.Item;

import Content.Abstract.Item;

import java.util.Random;

public class DefaultItem extends Item{
    public DefaultItem(String name, int amount) {
        super(name, amount);
    }

    public static DefaultItem random(String name, int minamount, int maxamount) {
        Random random = new Random();
        return new DefaultItem(name, random.nextInt(minamount,++maxamount));
    }
}
