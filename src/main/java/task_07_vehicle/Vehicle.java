package task_07_vehicle;
/**
 * 7.  Start with a base class of a Vehicle,
 *     then create a Car class that inherits from this base class.
 *     Finally, create another class, a specific type of Car that inherits from the Car class.
 *     
 *     You should be able to hand steering, changing gears, and moving(speed in other words).
 *     You will want to decide where to put the appropriate state and behaviours(fields and methods).
 *     As mentioned above, changing gears, increasing/decreasing speed should be included.
 *     For you specific type of vehicle you will want to add something specific for that type of car.
 */
public class Vehicle {
    private String name;
    private String color;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    // GETTERS
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getCurrentVelocity() {
        return currentVelocity;
    }
    public int getCurrentDirection() {
        return currentDirection;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees. ");
    }
    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }
    public void stop() {
        this.currentVelocity = 0;
    }
}