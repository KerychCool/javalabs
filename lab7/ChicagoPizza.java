public class ChicagoPizza implements IPizzaFactory {
    @Override
    public void createPizza(String pizzaName) {
        Pizza pizza;

        if (pizzaName.compareTo("Carbonara")==0)
            pizza = new CarbonaraPizza(" Chicago");

        else if (pizzaName.compareTo("Gavai")==0)
            pizza = new GavaiPizza(" Chicago");

    }
}
