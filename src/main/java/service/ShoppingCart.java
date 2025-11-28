package service;
import model.Food;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double getTotalPriceNoDiscount() {
        double sum = 0.0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getAmount() * products[i].getPrice();
        }
        return sum;
    }

    public double getTotalPriceWithDiscount() {
        double sum = 0.0;
        for (int i = 0; i < products.length; i++) {
            double discount = products[i].getDiscount();
            double priceWithDiscount = products[i].getPrice() * (1 - discount);
            sum += products[i].getAmount() * priceWithDiscount;
        }
        return sum;
    }

    public double getTotalPriceVegetarianNoDiscount() {
        double sum = 0.0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].isVegetarian()) {
                sum += products[i].getAmount() * products[i].getPrice();
            }
        }
        return sum;
    }
}
