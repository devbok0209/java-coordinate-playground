package rent.company;

import rent.car.Car;

import java.util.ArrayList;
import java.util.List;
public class RentCompany extends Company {

    private List<Car> cars;

    public RentCompany() {
        this.cars = new ArrayList<>();
    }

    @Override
    public RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        final String NEWLINE = System.getProperty("line.separator");
        String report = "";
        for (Car car : cars) {
            report += car.toString() + NEWLINE;
        }
        return report;
    }
}
