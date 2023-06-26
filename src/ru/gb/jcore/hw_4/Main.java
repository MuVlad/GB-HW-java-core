package ru.gb.jcore.hw_4;

import ru.gb.jcore.hw_4.Exception.AmountException;
import ru.gb.jcore.hw_4.Exception.CustomerException;
import ru.gb.jcore.hw_4.Exception.ProductException;
import ru.gb.jcore.hw_4.model.*;

public class Main {
    static Customer[] customers;
    static Product[] products;

    public static void main(String[] args) {
        customers = new Customer[]{
                new Customer("Ivan", "Ivanov", 21, Gender.MALE, "+79113114452"),
                new Customer("Petr", "Petrov", 27, Gender.MALE, "+79223004499")
        };

        products = new Product[]{
                new Product("Bread", 50, Category.STANDARD),
                new Product("Vodka", 500, Category.PREMIUM),
                new Product("Chocolate", 170, Category.STANDARD),
                new Product("Juice", 160, Category.PREMIUM),
                new Product("Meat", 890, Category.STANDARD)
        };

        Order[] orders = new Order[5];

        String[] phones = {"+79113114452", "+79113114452", "+79113114433", "+79223004499", "+79223004499"};
        String[] productTitles = {"Bread", "Water", "Vodka", "Chocolate", "Juice", "Meat"};
        int[] amounts = {2, 111, 7, -7, 32};

        int count = 0;

        for (int i = 0; i < 5; i++) {
            try {
                orders[i] = placeOrder(phones[i], productTitles[i], amounts[i]);
                count++;
            } catch (ProductException e) {
                System.out.println(e.getMessage());
            } catch (AmountException e) {
                orders[i] = placeOrder(phones[i], productTitles[i], 1);
                count ++;
            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Колличество покупок: " + count);

        System.out.println(products[0].getPrice());
        Order.setRandomSale(products[0]);
        System.out.println(products[0].getPrice());

    }

    public static Order placeOrder(String phone, String title, int amount) throws CustomerException, ProductException,
            AmountException {

        Customer customer = null;
        Product product = null;

        for (Customer c : customers) {
            if (c.getPhone().equals(phone)) {
                customer = c;
            }
        }
        if (customer == null) {
            throw new CustomerException("Customer not found");
        }

        for (Product p : products) {
            if (p.getTitle().equals(title)) {
                product = p;
            }
        }
        if (product == null) {
            throw new ProductException("Product not found");
        }

        if (amount > 100 || amount < 1) {
            throw new AmountException("Amount is not correct");
        }
        return new Order(customer, product, amount, product.getPrice());
    }
}
