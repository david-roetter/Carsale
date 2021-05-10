package car;

public class Car {

    private int id;

    private int cost;

    private boolean sold;


    private int repaircost;

    public Car(int id, int cost) {
        this.id = id;
        this.cost = cost;
        this.sold = false;
        this.repaircost = cost / 200;
    }
    private boolean isRentable;

    private int costPermonth;

    private int monthsRented;

    public Car(int id, int cost, int costPermonth) {
        this.id = id;
        this.cost = cost;
        this.sold = false;
        this.isRentable = true;
        this.costPermonth = costPermonth;
        this.repaircost = cost/200;

    }


    public void sell() {
        this.sold = true;
    }

    public int id() {
        return this.id;
    }

    public int cost() {
        return this.cost;
    }


    public int repairCost() { return this.repaircost; }

    public Invoice repair() { return Invoice.forRepairedCar(this);}

    public int costForRent() {return this.costPermonth * this.monthsRented;}


    public boolean isSold() {
        return this.sold;
    }

    public boolean isAvailable() {
        // check if a car is available (not sold or not rented)

        return !isSold() && isRentable();
    }

    public boolean isRentable() {
        return isRentable;
    }

    public void setMonths(int months) {
        this.monthsRented = months;
    }
}
