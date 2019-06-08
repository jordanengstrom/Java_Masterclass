package com.jordanengstrom;

public class HealthyBurger extends Hamburger {
    // a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
    // The healthy burger can have 6 items (Additions) in total.
    // hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
    // not the base class (Hamburger), since the two additions are only appropriate for this new class
    // (in other words new burger type).
    private boolean hasTomato;
    private boolean hasSideSalad;

    public HealthyBurger() {
        super("Brown rye", "veggie burger", 8.00);
        this.hasTomato = false;
        this.hasSideSalad = false;
    }


    public void addTomato() {
        super.setPrice(0.30);

        if (super.getTotalToppings() > 0) {
            super.setTotalToppings(true);
        } else {
            System.out.println("Error - total toppings:" + super.getTotalToppings());
        }
        System.out.println("Tomatos were added to your burger for $0.30");
        System.out.println("Total price: $" + super.getPrice());
    }

    public void addSideSalad() {
        super.setPrice(3.50);
        System.out.println("A side salad was added to your order for $3.50");
        System.out.println("Total price: $" + super.getPrice());
    }

    public void removeTomato() {
        super.setPrice(-0.30);
        if (super.getTotalToppings() > 0) {
            super.setTotalToppings(false);
        } else {
            System.out.println("Error: unable to remove value past min");
        }
        System.out.println("Tomatos were removed from your burger for -$0.30");
        System.out.println("Total price: $" + super.getPrice());
    }

    public void removeSideSalad() {
        super.setPrice(-3.50);
        if (!this.hasSideSalad) {
            System.out.println("Error - no side salad to remove");
        } else {
            this.hasSideSalad = false;
            System.out.println("Side salad successfully removed");
        }
    }

    @Override
    public double getBasePrice() {
        return 8.00;
    }

    @Override
    public void printCurrentBurger() {
        super.printCurrentBurger();
        System.out.println("Tomato: " + this.hasTomato);
        System.out.println("Side salad: " + this.hasSideSalad);

    }
}
