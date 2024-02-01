package phase2.strategy;

import java.util.ArrayList;
import java.util.List;

public class CarSimulator {
    private List<ICar> carList;

    public CarSimulator() {
        this.carList = new ArrayList<>();
    }

    public void simulate() {
        for (ICar car : carList) {
            car.showColor();
            System.out.println("Waiting to drive..");
            car.drive();
            System.out.println("\nNext car please...\n");
        }
    }

    public void addCar(ICar car) {
        this.carList.add(car);
    }
}
