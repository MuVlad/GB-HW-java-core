package ru.gb.jcore.hw_4.model;

import ru.gb.jcore.hw_4.Exception.TooMuchSaleException;

import java.util.Random;

public class Order {
    private Customer customer;
    private Product product;
    private int amount;
    private float cost;
    private Sale sale;

    public Order(Customer customer, Product product, int amount, float cost) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
        this.cost = cost;
    }


    public static void setRandomSale(Product product) {
        Random random = new Random();
        Sale[] sales = Sale.values();
        Sale sale = sales[random.nextInt(sales.length)];
        if (product.getCategory().equals(Category.PREMIUM) && sale.getDiscountSize() > 15){
            throw new TooMuchSaleException("На этот товар не применима скидка свыше 15%");
        }

        product.setPrice(product.getPrice() - ((product.getPrice() * sale.getDiscountSize())/100));
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", product=" + product +
                ", amount=" + amount +
                ", cost=" + cost +
                ", sale=" + sale +
                '}';
    }
}
