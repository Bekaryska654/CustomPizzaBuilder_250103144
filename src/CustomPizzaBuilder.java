import java.util.Locale;

public class CustomPizzaBuilder {
    public static void main(String[] args) {
        Pizza pizza = new Pineapple(
                new Olives(
                        new Cheese(
                                new PlainPizza())));

        System.out.println("Description: " + pizza.getDescription());
        System.out.println(String.format(Locale.US, "Total cost: $%.2f", pizza.getCost()));


        Pizza doubleCheese = new Cheese(new Cheese(new PlainPizza()));
        System.out.println();
        System.out.println("Description: " + doubleCheese.getDescription());
        System.out.println(String.format(Locale.US, "Total cost: $%.2f", doubleCheese.getCost()));
    }
}
