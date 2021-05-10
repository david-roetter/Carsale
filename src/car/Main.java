package car;

import car.exception.DealershipException;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Dealership carDealer = new Dealership(new HashMap<>(Map.ofEntries(
                Map.entry(1, new Car(1, 10000, 100)),
                Map.entry(2, new Car(2, 20000, 200))
        )));

        try {
            Car car = carDealer.testDrive(1);
            Invoice invoiceBoughtCar = carDealer.sell(car);

            Invoice invoiceRentedCar = carDealer.rent(car, 2);


            System.out.println(invoiceBoughtCar);
            System.out.println(invoiceRentedCar);
        } catch (DealershipException e) {
            System.out.println(e);
        }
    }
}
