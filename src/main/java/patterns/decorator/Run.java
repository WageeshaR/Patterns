package patterns.decorator;

import patterns.decorator.beverage.DarkRoast;
import patterns.decorator.beverage.Decaf;
import patterns.decorator.beverage.Espresso;
import patterns.decorator.beverage.HouseBlend;
import patterns.decorator.condiment.Milk;
import patterns.decorator.condiment.Mocha;
import patterns.decorator.condiment.Soy;
import patterns.decorator.condiment.Whip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
    enum UserInput {
        DARK_ROAST,
        DECAF,
        ESPRESSO,
        HOUSE_BLEND,
        MILK,
        MOCHA,
        SOY,
        WHIP,
        DONE
    }
    public static void main(String[] args) throws IOException {
        Beverage beverage = null;
        boolean finished = false;
        System.out.println("Please pick your beverage");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        UserInput input = UserInput.valueOf(line.toUpperCase());
        switch (input) {
            case DARK_ROAST:
                beverage = new DarkRoast();
                System.out.println("You've picked " + beverage.getDescription());
                break;
            case DECAF:
                beverage = new Decaf();
                System.out.println("You've picked " + beverage.getDescription());
                break;
            case ESPRESSO:
                beverage = new Espresso();
                System.out.println("You've picked " + beverage.getDescription());
                break;
            case HOUSE_BLEND:
                beverage = new HouseBlend();
                System.out.println("You've picked " + beverage.getDescription());
                break;
        }

        System.out.println("Please pick condiments one at a time with the count you want");
        while (! finished) {
            line = reader.readLine();
            String[] inputs = line.split("\\s+");
            input = UserInput.valueOf(inputs[0].toUpperCase());
            Condiment condiment = null;
            switch (input) {
                case MILK:
                    condiment = new Milk(Integer.parseInt(inputs[1]));
                    System.out.println("You've added " + condiment.getDescription());
                    break;
                case MOCHA:
                    condiment = new Mocha(Integer.parseInt(inputs[1]));
                    System.out.println("You've added " + condiment.getDescription());
                    break;
                case SOY:
                    condiment = new Soy(Integer.parseInt(inputs[1]));
                    System.out.println("You've added " + condiment.getDescription());
                    break;
                case WHIP:
                    condiment = new Whip(Integer.parseInt(inputs[1]));
                    System.out.println("You've added " + condiment.getDescription());
                    break;
                case DONE:
                    finished = true;
                    condiment = null;
                    break;
            }
            if (condiment != null) {
                condiment.setBeverage(beverage);
                beverage = condiment;
            }
        }

        assert beverage != null;
        System.out.println("\nTotal cost is £" + Math.round(beverage.cost() * 100.0) / 100.0);
    }
}
