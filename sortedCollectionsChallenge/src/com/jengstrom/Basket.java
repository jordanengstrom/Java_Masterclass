package com.jengstrom;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int toOrFromBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0) && (quantity <= item.quantityAvailable())) {
            System.out.println("There are " + item.quantityAvailable() +
                    " " + item.getName() + "(s) available" + " before reserving");
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            item.reserveStock(quantity);
            System.out.println("There are " + item.quantityAvailable() +
                               " " + item.getName() + "(s) available " + " after reserving");
            return inBasket;
        } else if( (item != null) && (quantity < 0)) {
            int inBasket = list.getOrDefault(item, 0);
            System.out.println("There are " + item.quantityAvailable() +
                               " " + item.getName() + "(s) available" + " before removing");

            list.remove(item, inBasket + quantity);
            System.out.println("There are " + item.quantityAvailable() +
                               " " + item.getName() + "(s) available " + " after removing");

            return inBasket;
            }
        return 0;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    public void checkout(Map<StockItem, Integer> list) {
        if (list.size() > 0) {
            System.out.println("Now checking out");
            for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
                item.getKey().adjustStock((item.getKey().quantityReserved() * -1));
            }
        } else {
            System.out.println("There are no items in your list to checkout");
        }
    }

    @Override
    public String toString() {

        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for(Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
