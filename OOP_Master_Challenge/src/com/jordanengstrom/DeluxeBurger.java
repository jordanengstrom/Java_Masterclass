package com.jordanengstrom;

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
public class DeluxeBurger extends Hamburger {
    private boolean hasChips;
    private boolean hasDrink;

    public DeluxeBurger() {
        super("Sesame seed bun", "beef", 9.50);
        this.hasChips = true;
        this.hasDrink = true;
    }

    public boolean getHasChips() {
        return hasChips;
    }

     public boolean getHasDrink() {
        return hasDrink;
    }

    @Override
    public double getBasePrice() {
        return 9.50;
    }

    public void printCurrentBurger() {
        super.printCurrentBurger();
        System.out.println("Chips: " + this.hasChips);
        System.out.println("Drink: " + this.hasDrink);

    }

}
