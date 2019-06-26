public class CarApp {
    public static void main(String[] args){
        Car carJetta = new Car("Jetta", "blue");
        Car carPor = new Car("Porche", "red", "");

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
        carPor.stop();



    }
}
