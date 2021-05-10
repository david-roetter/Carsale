package car;

public class Invoice {
    private int carId;

    private int price;

    private Invoice(int carId, int price) {
        this.carId = carId;
        this.price = price;
    }

    public static Invoice forSoldCar(Car carToSell) {
        return new Invoice(carToSell.id(), carToSell.cost());
    }

    public static Invoice forRentCar(Car carToRent) {
        return new Invoice(carToRent.id(), carToRent.costForRent());
    }

    public int carId() {
        return carId;
    }

    public int price() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Invoice: $%d for car %d", this.price, this.carId);
    }
}
