public class Car extends Vehicle {
    private String status;
    private int speed;


    public Car() {
        super();
        this.status = "";
        speed = 0;
    }

    public Car(String model, String color) {
        super(model, color);
        this.status = "";
        this.speed = 0;
    }

    public Car(String model, String color, String status) {
        super(model, color);
        this.status = status;
        this.speed = 0;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        checkSpeed();
    }

    // Abstract method to return the status of a vehicle
    public void printInfo() {
        System.out.println("The " + getColor() + " " + getModel() + this.status);
    }

    public void start() {
        this.status = " is starting";
        printInfo();
    }

    public void accelerate() {
        this.status = " is accelerating";
        printInfo();
    }

    public void checkSpeed() {
        this.status = " is going " + this.speed + " mph";
        printInfo();
    }

    public void gotodestination(String dest) {
        this.status = " is going to " + dest;
        printInfo();
    }

    public void stop() {
        this.status = " has stopped";
        printInfo();
    }

    public void passing(String varC) {
        this.status = " is passing " + varC;
        printInfo();
    }
}
