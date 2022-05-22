package rent;

import rent.car.Avante;
import rent.car.K5;
import rent.car.Sonata;
import rent.company.RentCompany;

public class Run {

    public static void main(String[] args) {
        RentCompany rentCompany = new RentCompany().create();
        rentCompany.addCar(new Sonata(150));
        rentCompany.addCar(new K5(260));
        rentCompany.addCar(new Sonata(120));
        rentCompany.addCar(new Avante(300));
        rentCompany.addCar(new K5(390));

        String report = rentCompany.generateReport();
        System.out.println(report);
    }
}
