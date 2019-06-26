/*
 * private member variables
a default constructor
an overloaded constructor
methods which return a string indicating each task the car is performing
 */
abstract public class Vehicle {
    private String color;
    private String model;


    // Constructor w/o any parameters
    public Vehicle() {
        this.model = "";
        this.color = "";
    }

    // Constructor with parameters
    public Vehicle(String model, String color) {
        this.model = model;
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    // Abstract method to return the status of a vehicle
    abstract public void printInfo();

}
