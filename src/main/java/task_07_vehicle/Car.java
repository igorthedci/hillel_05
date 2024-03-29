package task_07_vehicle;
/**
 * 7.  Start with a base class of a Vehicle,
 *     then create a Car class that inherits from this base class.
 *     Finally, create another class, a specific type of Car that inherits from the Car class.
 *     You should be able to hand steering, changing gears, and moving(speed in other words).
 *     You will want to decide where to put the appropriate state and behaviours(fields and methods).
 *     As mentioned above, changing gears, increasing/decreasing speed should be included.
 *     For you specific type of vehicle you will want to add something specific for that type of car.
 */
public class Car extends Vehicle {

    private Transmission transmission;

    // CONSTRUCTOR

    public Car(String name, String color) {
        super(name, color);
    }
    public Car(String name, String color, Transmission transmission) {
        super(name, color);
        this.transmission = transmission;
    }

    // GETTERs and SETTERs
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    public Transmission getTransmission() {
        return transmission;
    }

    // INFO
    public void info() {
        System.out.println(
                "Car info:" +
                        "\n\tname: " + this.getName() +
                        "\n\tcolor: " + this.getColor() +
                        "\n\tactual velocity: " + this.getCurrentVelocity() +
                        "\n\tactual direction: " + this.getCurrentDirection());
        this.transmission.info();
    }
    // DRIVE
    public void drive(int aSpeed, int aDirection) {
        int adjustSpeed = this.transmission.adjustSpeed(aSpeed);
        this.move(adjustSpeed, aDirection);
//        if (adjustSpeed != aSpeed)
//            System.out.println("Transmission action is needed!");
    }
}
