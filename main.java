import java.util.Random;

import Content.Performance;
import Content.PerformanceParams;
import Content.Winter;
import Content.WinterStages;
import Content.Person.Darenka;
import Content.Person.Kokovanya;

public class main {
    public static void main(String[] args) {
        PerformanceParams params = new PerformanceParams(WinterStages.random(new Random()));

        Performance performance = new Performance(params);

        Kokovanya kokovanya = new Kokovanya("Ко-кованя");
        Darenka darenka = new Darenka("Даренка");
        Winter winter = new Winter("Зима");

        performance.addPatrticipant(kokovanya);
        performance.addPatrticipant(darenka);
        performance.addPatrticipant(winter);

        performance.perform();
    }
}
