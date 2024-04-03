package nickdg.entities;


import java.util.List;


public class Menù {
    private List<Pizza> pizzas;
    private List<Toppings> toppings;
    private List<Bevarages> bevarages;


    public Menù(List<Pizza> pizzas, List<Toppings> toppings,List<Bevarages> bevarages) {
        this.pizzas = pizzas;

        this.toppings = toppings;

        this.bevarages = bevarages;

    }

    @Override
    public String toString() {
        return "Menù" +"\n" +
                "Pizzas" + "\n" +
                pizzas +
                "\nToppings" + "\n" +
                 toppings +
                "\nBevande" + "\n" +
                bevarages +
                '}';
    }
//    @Override
//    public String toString() {
//        return "Menù=" +"\n" +
//                "Pizzas" + "\n" +
//                "Pizza Margherita" + pizza1 + "\n" +
//                "Pizza Salami" + pizza2 +"\n" +
//                "Toppings" +"\n" +
//                "Cheese " + topping1 +"\n" +
//                "Ham" + topping2 +"\n" +
//                "Onions" + topping3 +"\n" +
//                "Salami" + topping4 +"\n" +
//                "Drinks " + "\n" +
//                "Lemonade" + bevanda1 +"\n" +
//                "Water" + bevanda2 +"\n" +
//                "Wine" + bevanda3 +"\n"
//                ;
//    }
}
