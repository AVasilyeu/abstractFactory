public class ChicagoPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStyleeroniPizza();
        } else {
            return null;
        }
    }

    private class ChicagoStyleVeggiePizza extends Pizza {
    }

    private class ChicagoStyleClamPizza extends Pizza {
    }

    private class ChicagoStyleeroniPizza extends Pizza {
    }
}
