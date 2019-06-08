package com.jordanengstrom;

public class Hamburger {
    // The basic hamburger should have the following items.
    // Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
    // the customer can select to be added to the burger.
    // Each one of these items gets charged an additional price so you need some way to track how many items got added
    // and to calculate the final price (base burger with all the additions).
    // This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
    // Create a Hamburger class to deal with all the above.
    // The constructor should only include the roll type, meat and price, can also include name of burger or you
    // can use a setter.

    private String breadRollType;
    private String meat;
    private String burgerName;
    private boolean hasCheese;
    private boolean hasPickles;
    private boolean hasOnions;
    private boolean hasLettuce;
    private int totalToppings;
    private double price;
    private double basePrice;

    public Hamburger(String breadRollType, String meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.burgerName = "your burger";
        this.hasCheese = false;
        this.hasPickles = false;
        this.hasOnions = false;
        this.hasLettuce = false;
        this.totalToppings = 0;
        this.price = price;
        this.basePrice = price;
    }

    // getters and setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double delta) {
        this.price += delta;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public boolean getHasCheese() {
        return hasCheese;
    }

    public boolean getHasPickles() {
        return hasPickles;
    }

    public boolean getHasOnions() {
        return hasOnions;
    }

    public boolean getHasLettuce() {
        return hasLettuce;
    }

    public int getTotalToppings() {
        return totalToppings;
    }

    public void setTotalToppings(boolean addOrRemove) {
        if (!addOrRemove) {
            //false removes toppings
            this.totalToppings -= 1;
        } else {
            //true adds toppings
            this.totalToppings += 1;
        }
    }

    // name the burger if you want
    public void setBurgerName(String bn) {
        this.burgerName = bn;
    }

    public double getBasePrice() {
        return basePrice;
    }



    // adding toppings
    public void addCheese() {
//        this.price += 0.50;
        this.hasCheese = true;
        this.totalToppings += 1;
        System.out.println("Cheese was added to your burger for $0.50");
        System.out.println("Total price: $" + this.price);
    }

    public void addPickles() {
        this.price += 0.30;
        this.hasPickles = true;
        this.totalToppings += 1;
        System.out.println("Pickles were added to your burger for $0.30");
        System.out.println("Total price: $" + this.price);
    }

    public void addOnions() {
        this.price += 0.30;
        this.hasOnions = true;
        this.totalToppings += 1;
        System.out.println("Onions were added to your burger for $0.30");
        System.out.println("Total price: $" + this.price);
    }

    public void addLettuce() {
        this.price += 0.30;
        this.totalToppings += 1;
        this.hasLettuce = true;
        System.out.println("Pickles were added to your burger for $0.30");
        System.out.println("Total price: $" + this.price);
    }


    // remove toppings
    public void removeCheese() {
        this.price -= 0.50;
        if (totalToppings > 0) {
            this.totalToppings -= 1;
        } else {
            this.totalToppings = 0;
        }
        System.out.println("Cheese was removed to your burger for -$0.50");
        System.out.println("Total price: $" + this.price);
    }

    public void removePickles() {
        this.price -= 0.30;
        if (totalToppings > 0) {
            this.totalToppings -= 1;
        } else {
            this.totalToppings = 0;
        }
        System.out.println("Pickles were removed to your burger for -$0.30");
        System.out.println("Total price: $" + this.price);
    }

    public void removeOnions() {
        this.price -= 0.30;
        if (totalToppings > 0) {
            this.totalToppings -= 1;
        } else {
            this.totalToppings = 0;
        }
        System.out.println("Onions were removed to your burger for -$0.30");
        System.out.println("Total price: $" + this.price);
    }

    public void removeLetuce() {
        this.price -= 0.30;
        if (totalToppings > 0) {
            this.totalToppings -= 1;
        } else {
            this.totalToppings = 0;
        }
        System.out.println("Pickles were removed to your burger for -$0.30");
        System.out.println("Total price: $" + this.price);
    }

    public void printCurrentBurger() {
        System.out.println("---------- Your Order ----------");
        System.out.println("Bread roll type: " + this.breadRollType);
        System.out.println("Meat" + this.meat);
        System.out.println("Burger Name: " + this.burgerName);
        System.out.println("Cheese: " + this.hasCheese);
        System.out.println("Pickles: " + this.hasPickles);
        System.out.println("Onions: " + this.hasOnions);
        System.out.println("Lettuce: " + this.hasLettuce);
        System.out.println("Total toppings: " + this.totalToppings);
        System.out.println("Current price: " + this.price);
        System.out.println("Base price" + this.basePrice);

    }
}
