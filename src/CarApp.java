import java.util.ArrayList;

public class CarApp {
    public static void main(String[] args){
        ArrayList<Car> carArray = new ArrayList<Car>();

        Car carPor = new Car("Porche", "blue", " is parked");
        carArray.add(carPor);


        Car carJetta = new Car("Jetta", "blue");
        carPor = new Car("Porche", "red", "");

        carArray.add(carJetta);
        carArray.add(carPor);

        carJetta.start();
        carPor.start();

        carJetta.accelerate();
        carJetta.setSpeed(50);

        carPor.accelerate();
        carPor.setSpeed(90);
        carJetta.accelerate();

        carPor.passing(carJetta.getColor() + " " + carJetta.getModel());

        carPor.checkSpeed();
        carJetta.checkSpeed();

        carJetta.gotodestination("get car serviced");
        carPor.gotodestination("an airport");

        carJetta.stop();
        // carPor.stop();


        System.out.println("\n\nThe status of cars are...");
        for (Car item : carArray)
            item.printInfo();

    }
}
